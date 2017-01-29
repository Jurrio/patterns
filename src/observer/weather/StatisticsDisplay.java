package observer.weather;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement{

	private List<Float> temperatureList;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		this.temperatureList = new ArrayList<>();
	}
	
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + getAverage() + "/" + getMax() + "/" + getMin());
		
	}

	private Float getAverage() {
		if (temperatureList.isEmpty()) {
			return 0.0f;
		}
		float sum = 0;
		for (float f : temperatureList) {
			sum += f;
		}
		return sum / temperatureList.size();
	}

	private Float getMax() {
		if (temperatureList.isEmpty()) {
			return 0.0f;
		}
		float max = temperatureList.get(0);
		for (float f : temperatureList) {
			if (f > max) {
				max = f;
			}
		}
		return max;
	}

	private Float getMin() {
		if (temperatureList.isEmpty()) {
			return 0.0f;
		}
		float min = temperatureList.get(0);
		for (float f : temperatureList) {
			if (f < min) {
				min = f;
			}
		}
		return min;
	}


	@Override
	public void update(float temperature, float humidity, float pressure) {
		temperatureList.add(temperature);
		display();
	}

}

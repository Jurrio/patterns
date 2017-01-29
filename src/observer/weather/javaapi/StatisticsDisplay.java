package observer.weather.javaapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import observer.weather.DisplayElement;

public class StatisticsDisplay implements Observer, DisplayElement{

	private List<Float> temperatureList;
	private Observable observable;
	
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
		temperatureList = new ArrayList<>();
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
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			temperatureList.add(data.getTemperature());
			display();
		}
	}

}

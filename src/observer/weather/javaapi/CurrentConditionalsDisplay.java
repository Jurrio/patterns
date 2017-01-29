package observer.weather.javaapi;

import java.util.Observable;
import java.util.Observer;

import observer.weather.DisplayElement;

public class CurrentConditionalsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	Observable observable;
	
	public CurrentConditionalsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData data = (WeatherData) obs;
			this.temperature = data.getTemperature();
			this.humidity = data.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity");		
	}

}

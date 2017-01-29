package observer.weather.javaapi;

import java.util.Observable;
import java.util.Observer;

import observer.weather.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement{

	private float currentPressure;
	private Observable observable;
	private String improving = "Improving";
	private String rainy = "Rainy";
	private String theSame = "The Same";
	private String displayString;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println(displayString);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			float pressure = data.getPressure();
			if (pressure > currentPressure) {
				displayString = improving;
			} else if (pressure < currentPressure) {
				displayString = rainy;
			} else if (pressure == currentPressure) {
				displayString = theSame;
			}
			currentPressure = pressure;
			display();
			
		}
	}

}

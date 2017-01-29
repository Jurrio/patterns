package observer.weather.javaapi;

import java.util.Observable;

public class WeatherData extends Observable{

	private float temperature;
	private float humidity;
	private float pressure;
	
	public void meansurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeansurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		meansurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}

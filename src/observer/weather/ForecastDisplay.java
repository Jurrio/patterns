package observer.weather;

public class ForecastDisplay implements Observer, DisplayElement{

	private float currentPressure;
	private WeatherData weatherData;
	private String improving = "Improving";
	private String rainy = "Rainy";
	private String theSame = "The Same";
	private String displayString;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(displayString);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
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

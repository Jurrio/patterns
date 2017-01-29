package observer.weather;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionalsDisplay currentDisplay = new CurrentConditionalsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeansurements(30, 65, 30.4F);
		weatherData.setMeansurements(28, 68, 31.6F);
		weatherData.setMeansurements(27, 66, 29.0F);

	}
}

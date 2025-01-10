package Chapter2.JavaBuiltInObserver;

import Chapter2.Observer.DisplayElement;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    DisplayElement forecastDisplay = new ForecastDisplay(weatherData);
    DisplayElement statisticsDisplay = new StatisticsDisplay(weatherData);

    weatherData.setMeasurementsChanged(25f, 87f, 102f);
    weatherData.setMeasurementsChanged(27f, 56f, 99f);
    weatherData.setMeasurementsChanged(230f, 89f, 87f);
  }
}

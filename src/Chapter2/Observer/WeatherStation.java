package Chapter2.Observer;

import Chapter2.Observer.impl.WeatherData;
import Chapter2.Observer.impl.display.CurrentConditionsDisplay;
import Chapter2.Observer.impl.display.ForecastDisplay;
import Chapter2.Observer.impl.display.HeatIndexDisplay;
import Chapter2.Observer.impl.display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayElement forecastDisplay = new ForecastDisplay(weatherData);
        DisplayElement statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(25f, 87f, 102f);
        weatherData.setMeasurements(27f, 56f, 99f);
        weatherData.setMeasurements(230f, 89f, 87f);
    }
}

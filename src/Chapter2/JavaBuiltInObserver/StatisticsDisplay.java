package Chapter2.JavaBuiltInObserver;

import Chapter2.Observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings = 0;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
            + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            tempSum += weatherData.getTemperature();
            maxTemp = Math.max(maxTemp, weatherData.getTemperature());
            minTemp = Math.min(minTemp, weatherData.getTemperature());
            numReadings++;
            display();
        }
    }
}

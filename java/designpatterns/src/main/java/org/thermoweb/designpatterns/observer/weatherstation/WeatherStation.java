package org.thermoweb.designpatterns.observer.weatherstation;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(25, 65, 30.4f);
        weatherData.setMeasurements(26, 70, 29.2f);
        weatherData.setMeasurements(23, 90, 39.2f);
    }
}

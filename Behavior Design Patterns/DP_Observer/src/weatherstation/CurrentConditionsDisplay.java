/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.Observable;
import java.util.Observer;

/**
 * @author KI
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("\nDisplej 1 - Aktualne podmienky");
        System.out.println("==============================");
        System.out.println("teplota: " + temperature + " °C");
        System.out.println("vlhkost: " + humidity + " %");
        System.out.println("tlak: " + pressure + " hPa");
    }


}
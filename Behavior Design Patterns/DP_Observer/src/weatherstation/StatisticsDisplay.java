/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Student
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float min_temperature = 500;
    private float max_temperature = -500;
    private float avg_temperature = 0;
    private float sum_temperature = 0;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temperature = weatherData.getTemperature();
            sum_temperature += temperature;
            avg_temperature++;

            if (temperature < min_temperature) {
                min_temperature = temperature;
            }

            if (temperature > max_temperature) {
                max_temperature = temperature;
            }
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("\nDisplej 2 - Aktualne podmienky");
        System.out.println("==============================");
        System.out.println("Minimalna teplota: " + min_temperature + " °C.");
        System.out.println("Maximalna teplota: " + max_temperature + " °C.");
        System.out.println("Priemerna teplota: " + avg_temperature + " °C.");
    }


}

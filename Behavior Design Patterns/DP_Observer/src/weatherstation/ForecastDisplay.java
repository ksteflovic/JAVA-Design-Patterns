/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.Observer;
import java.util.Observable;

/**
 * @author stefi
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float aktualny_tlak = 0.0f;
    private float predosly_tlak;
    private int count = 0;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            predosly_tlak = aktualny_tlak;
            aktualny_tlak = weatherData.getPressure();
            count++;
            display();

        }
    }

    @Override
    public void display() {
        if (count > 1) {
            System.out.println("\nDisplej 3 - Predpoved pocasia");
            System.out.println("==============================");
            if (aktualny_tlak > predosly_tlak) {
                System.out.println("Pocasie sa zlepsi!");
            } else if (aktualny_tlak < predosly_tlak) {
                System.out.println("Ochladi sa a mozno bude prsat.");
            } else if (aktualny_tlak == predosly_tlak) {
                System.out.println("Ziadna zmena nehrozi.");
            }
        }
    }

}

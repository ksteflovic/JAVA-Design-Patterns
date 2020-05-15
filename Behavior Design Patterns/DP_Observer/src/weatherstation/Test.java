/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherstation;

/**
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Vytvorme meteostanicu (Subjekt)
        WeatherData wd = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(wd);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wd);
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(wd);

        // teplota, vlhkost, tlak
        wd.setMeasurements(15, 93f, 1000);
        wd.setMeasurements(17, 90f, 995);
        wd.setMeasurements(20, 85f, 980);
        wd.setMeasurements(25, 65f, 998);
    }

}

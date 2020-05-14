/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nv_adapter_uloha1a;

import nv_adapter_uloha1.CelsiusDegreeRegulator;
import nv_adapter_uloha1.TemperatureInfo;

/**
 *
 * @author Štefinka
 */
public class ClassAdapter extends CelsiusDegreeRegulator implements TemperatureInfo {
/*
    Doteraz sme používali regulátor teploty, ktorý mal metódy na čítanie a nastavovanie teploty v stupňoch Celzia i Fahrenheita.
    Nový regulátor pracuje len s hodnotami v stupňoch Celzia. Klient obsahuje kód spoliehajúci sa na pôvodné rozhranie. Pripravte adaptér, ktorý
    umožní integrovať do systému aj triedu CelsiusDegreeRegulator, bez nutnosti meniť kód klienta.
*/
    boolean celsius;
    boolean fahrenthein;

    @Override
    public double getFahrenheitDegrees() {
        return fahrenthein ? getTemperature() : Math.round((((9*getTemperature())/5) + 32)*100.0)/100.0;
    }

    @Override
    public void setFahrenheitDegrees(double deg) {
        fahrenthein = true;
        celsius = false;
        setTemperature(deg);
    }

    @Override
    public double getCelsiusDegrees() {
        return celsius ? getTemperature() : Math.round(((5*(getTemperature()-32))/9)*100.0)/100.0;
    }

    @Override
    public void setCelsiusDegrees(double deg) {
        celsius = true;
        fahrenthein = false;
        setTemperature(deg);
    }
    
}

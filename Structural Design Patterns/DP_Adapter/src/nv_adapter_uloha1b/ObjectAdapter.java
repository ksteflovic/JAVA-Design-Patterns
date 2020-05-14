package nv_adapter_uloha1b;

import nv_adapter_uloha1.CelsiusDegreeRegulator;
import nv_adapter_uloha1.TemperatureInfo;

public class ObjectAdapter implements TemperatureInfo {
/*
    Doteraz sme používali regulátor teploty, ktorý mal metódy na čítanie a nastavovanie teploty v stupňoch Celzia i Fahrenheita.
    Nový regulátor pracuje len s hodnotami v stupňoch Celzia. Klient obsahuje kód spoliehajúci sa na pôvodné rozhranie. Pripravte adaptér, ktorý
    umožní integrovať do systému aj triedu CelsiusDegreeRegulator, bez nutnosti meniť kód klienta.
*/

    CelsiusDegreeRegulator cls;
    boolean celsius;
    boolean fahrenthein;

    public ObjectAdapter(CelsiusDegreeRegulator cls)
    {
        this.cls = cls;
    }

    @Override
    public double getFahrenheitDegrees() {
        return fahrenthein ? cls.getTemperature() : Math.round((((9*cls.getTemperature())/5) + 32)*100.0)/100.0;
    }

    @Override
    public void setFahrenheitDegrees(double deg) {
        fahrenthein = true;
        celsius = false;
        cls.setTemperature(deg);
    }

    @Override
    public double getCelsiusDegrees() {
        return celsius ? cls.getTemperature() : Math.round(((5*(cls.getTemperature()-32))/9)*100.0)/100.0;
    }

    @Override
    public void setCelsiusDegrees(double deg) {
        celsius = true;
        fahrenthein = false;
        cls.setTemperature(deg);
    }

}

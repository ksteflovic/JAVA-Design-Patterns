/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nv_adapter_uloha1;


import nv_adapter_uloha1a.ClassAdapter;
import nv_adapter_uloha1b.ObjectAdapter;

/**
 *
 * @author KI
 */
public class AdapterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // TODO code application logic here
        CelsiusDegreeRegulator newRegulator = new CelsiusDegreeRegulator();
        newRegulator.setTemperature(12.5);
        System.out.println(newRegulator.getTemperature());
        
 // Klient:

        // Class
        TemperatureInfo t1 = new ClassAdapter();
        t1.setCelsiusDegrees(50.0);
        System.out.println("Fahrenheit: "+ t1.getFahrenheitDegrees());
        System.out.println("Celsius: "+ t1.getCelsiusDegrees());

        // Object
        TemperatureInfo t2 = new ObjectAdapter(newRegulator);
        t2.setCelsiusDegrees(50.0);
        System.out.println("Fahrenheit: "+ t2.getFahrenheitDegrees());
        System.out.println("Celsius: "+ t2.getCelsiusDegrees());
        
    }
}

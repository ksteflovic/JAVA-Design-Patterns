/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_factorymethod;

import java.util.ArrayList;

/**
 *
 * @author KI
 */
public abstract class Pizza {

    protected String name;

    protected ArrayList<String> toppings;

    public Pizza() {
        toppings = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
         System.out.println("Baking " + name);
    }

    public void cut() {
         System.out.println("Cutting " + name);
    }

    public void box() {
         System.out.println("Boxing " + name);
    }
}
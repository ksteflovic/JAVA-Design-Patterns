/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_factorymethod;

/**
 *
 * @author KI
 */
public abstract class Pizzeria {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_simplefactory;

public class Pizzeria {

    private SimplePizzaFactory factory;

    public Pizzeria(SimplePizzaFactory factory) {
        this.factory = factory;
    }


    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

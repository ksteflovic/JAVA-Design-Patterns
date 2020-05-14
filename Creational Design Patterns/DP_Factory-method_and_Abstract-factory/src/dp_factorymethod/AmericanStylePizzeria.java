/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_factorymethod;

public class AmericanStylePizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new AmericanStyleCheesePizza();
        } else if (type.equals("hawai")) {
            pizza = new AmericanStyleHawaiPizza();
        } else if (type.equals("salami")) {
            pizza = new AmericanStyleSalamiPizza();
        }

        return pizza;
    }
}

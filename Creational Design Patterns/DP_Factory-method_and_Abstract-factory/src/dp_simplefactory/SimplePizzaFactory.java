/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_simplefactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
         if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("hawai")) {
            pizza = new HawaiPizza();
        } else if (type.equals("salami")) {
          pizza = new SalamiPizza();
        }
        return pizza;
    }
}
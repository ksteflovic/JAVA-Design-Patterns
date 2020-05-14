/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_simplefactory;

/**
 *
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create pizzeria
        Pizzeria casaMia = new Pizzeria( new SimplePizzaFactory());

        // order a pizza
        Pizza pizza = casaMia.orderPizza("cheese");
        System.out.println(pizza.getName() + " is ready!");

        pizza = casaMia.orderPizza("hawai");
        System.out.println(pizza.getName() + " is ready!");
        
        
      
    }

}

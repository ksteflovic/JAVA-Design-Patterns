/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_factorymethod;

/**
 *
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create american pizzeria
        Pizzeria america = new AmericanStylePizzeria();
        // order a pizza
        Pizza pizza = america.orderPizza("hawai");
        
        
        
       
    }

}

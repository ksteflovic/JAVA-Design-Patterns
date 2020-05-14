/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nv_abstractfactory;

/**
 *
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pizzeria america = new AmericanPizzeria( );
        Pizza pizza = america.orderPizza("veggie");
  
        System.out.println();
        
        Pizzeria italy = new ItalianPizzeria( );
        pizza = italy.orderPizza("veggie");

    }

}

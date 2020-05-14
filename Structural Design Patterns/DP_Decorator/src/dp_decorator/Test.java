package nv_decorator_1;

/**
 *
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TO DO:

        // create an Espresso object and write information about it (description, price)

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()+": "+espresso.cost()+" €");

        // create a Decaf object and wrap it with Milk and Sugar decorators,
        // and write informations about it

        Beverage decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Sugar(decaf);
        System.out.println(decaf.getDescription()+": "+Math.round(decaf.cost()*100.0)/100.0+" €");

        // create a DarkRoast object, wrap it twice with Sugar decorator
        // and once with Whip decorator and write down information about it
        
        Beverage darkroast = new DarkRoast();
        darkroast = new Sugar(darkroast);
        darkroast = new Sugar(darkroast);
        darkroast = new Whip(darkroast);
        System.out.println(darkroast.getDescription()+": "+Math.round(darkroast.cost()*100.0)/100.0+" €");
        
        
    }
}

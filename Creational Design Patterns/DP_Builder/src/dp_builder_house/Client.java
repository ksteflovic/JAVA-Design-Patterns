/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nv_builder_domy;

/**
 *
 * @author KI
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Builder builder = new LegoBuilder();
        Director director = new Director(builder);
        LegoHouse house = (LegoHouse)director.buildHouse();
        System.out.println(house);

        /*
        Builder builder = new BrickBuilder();
        Director director = new Director(builder);
        BrickHouse house = (BrickHouse)director.buildHouse();
        System.out.println(house);
        */

        /*
        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b");
        System.out.println(sb.toString());
        */
 
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nv_builder_domy;

/**
 *
 * @author KI
 */
public class Director {
    private Builder builder;
    
    public Director(Builder b) {
        this.builder = b;
    }
    public Object buildHouse() {
        builder.buildGrounding();
        builder.buildCellar();
        builder.buildGroundFloor();
        builder.buildFloor();
        builder.buildRoof();
       return builder.giveFinishedBuilding();
    }    
}

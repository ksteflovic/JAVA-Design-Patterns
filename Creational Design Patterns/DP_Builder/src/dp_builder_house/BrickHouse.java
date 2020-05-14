/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nv_builder_domy;

/**
 *
 * @author KI
 */
public class BrickHouse {

    // internal representation of the house (mainly different than in the Lego house class)
    private int floorCount = 0;

    public void buildFloor() {
        floorCount++;
    }

    public String toString() {
        return "House from bricks:\n" + floorCount + " floor(s)";
    }

}

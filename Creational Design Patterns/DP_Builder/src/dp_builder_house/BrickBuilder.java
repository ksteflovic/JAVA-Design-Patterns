/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nv_builder_domy;

/**
 *
 * @author KI
 */
public class BrickBuilder implements Builder{
    private BrickHouse d = new BrickHouse();
   
    public void buildGrounding() {
    }

    public void buildCellar() {
    }

    public void buildGroundFloor() {
        d.buildFloor();
    }

    public void buildFloor() {
        //we will always want a 5 floor house (including the ground floor)
        d.buildFloor();
        d.buildFloor();
        d.buildFloor();
        d.buildFloor();
    }

    public void buildRoof() {
    }

    public Object giveFinishedBuilding() {
        return d;
    }
  
}

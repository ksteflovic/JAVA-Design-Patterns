/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nv_builder_domy;

/**
 *
 * @author KI
 */
public class LegoBuilder implements Builder {

    private LegoHouse d = new LegoHouse();


    public void buildGrounding() {
       // none
    }

    public void buildCellar() {
        // none
    }

    public void buildGroundFloor() {
        d.addNextPart("Walls of white pieces, including suitably located windows and doors.");
    }

    public void buildFloor() {
        d.addNextPart("Grey parts of color such as ceiling + walls and floor windows.");
    }

    public void buildRoof() {
         d.addNextPart("Red roof.");
    }

    public Object giveFinishedBuilding() {
        return d;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nv_builder_domy;

/**
 *
 * @author KI
 */
public interface Builder {
    public void buildGrounding();
    public void buildCellar();
    public void buildGroundFloor();
    public void buildFloor();
    public void buildRoof();
    public Object giveFinishedBuilding();
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nv_builder_domy;

import java.util.ArrayList;

/**
 *
 * @author KI
 */
public class LegoHouse {

    // internal representation of the Lego house
    private ArrayList<String> legoParts = new ArrayList<String>();

    public void addNextPart(String part) {
        legoParts.add(part);
    }

    public String toString() {
        return "Lego house:\n"  + legoParts.toString();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_command.commands.onCommands;

import dp_command.commands.Command;
import dp_command.gadgets.Lamp;

/**
 *
 * @author KI
 */
public class LampOn implements Command {

    private Lamp lamp;

    public LampOn(Lamp lamp) {
        this.lamp = lamp;
    }

    public void execute() {
        lamp.on();
    }

    @Override
    public void undo() {
        lamp.off();
    }


}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_command.commands.offCommands;

import dp_command.commands.Command;
import dp_command.gadgets.Lamp;

/**
 *
 * @author KI
 */
public class LampOff implements Command {
    private Lamp lamp;

    public LampOff(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
       lamp.off();
    }

    @Override
    public void undo() {
        lamp.on();
    }


}

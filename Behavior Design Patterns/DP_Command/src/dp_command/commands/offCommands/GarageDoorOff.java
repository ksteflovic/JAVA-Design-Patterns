package dp_command.commands.offCommands;

import dp_command.commands.Command;
import dp_command.gadgets.GarageDoor;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 12:13
 */
public class GarageDoorOff implements Command {

    GarageDoor gd;

    public GarageDoorOff(GarageDoor gd) {
        this.gd = gd;
    }

    @Override
    public void execute() {
        gd.close();
    }

    @Override
    public void undo() {
        gd.open();
    }
}

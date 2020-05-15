package dp_command.commands.onCommands;

import dp_command.commands.Command;
import dp_command.gadgets.GarageDoor;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 12:13
 */
public class GarageDoorOn implements Command {

    GarageDoor gd;

    public GarageDoorOn(GarageDoor gd) {
        this.gd = gd;
    }

    @Override
    public void execute() {
        gd.open();
    }

    @Override
    public void undo() {
        gd.close();
    }
}

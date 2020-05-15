package dp_command.commands.offCommands;

import dp_command.commands.Command;
import dp_command.gadgets.Shutter;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 12:13
 */
public class ShutterOff implements Command {

    Shutter shutter;

    public ShutterOff(Shutter shutter) {
        this.shutter = shutter;
    }

    @Override
    public void execute() {
        shutter.pull_down();
    }

    @Override
    public void undo() {
        shutter.pull_up();
    }
}

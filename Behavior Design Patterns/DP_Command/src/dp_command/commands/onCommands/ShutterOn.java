package dp_command.commands.onCommands;

import dp_command.commands.Command;
import dp_command.gadgets.Shutter;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 12:13
 */
public class ShutterOn implements Command {

    Shutter shutter;

    public ShutterOn(Shutter shutter) {
        this.shutter = shutter;
    }

    @Override
    public void execute() {
        shutter.pull_up();
    }

    @Override
    public void undo() {
        shutter.pull_down();
    }
}

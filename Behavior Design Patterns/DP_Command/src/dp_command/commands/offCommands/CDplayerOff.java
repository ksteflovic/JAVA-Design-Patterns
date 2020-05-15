package dp_command.commands.offCommands;

import dp_command.commands.Command;
import dp_command.gadgets.CDplayer;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 19:55
 */
public class CDplayerOff implements Command {

    private CDplayer cdplayer;

    public CDplayerOff(CDplayer cdplayer) {
        this.cdplayer = cdplayer;
    }

    @Override
    public void execute() {
        cdplayer.off();
    }

    @Override
    public void undo() {
        cdplayer.on();
    }
}

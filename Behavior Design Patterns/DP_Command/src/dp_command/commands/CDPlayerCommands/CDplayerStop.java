package dp_command.commands.CDPlayerCommands;

import dp_command.commands.Command;
import dp_command.gadgets.CDplayer;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 12:13
 */
public class CDplayerStop implements Command {

    CDplayer cdplayer;

    public CDplayerStop(CDplayer cdplayer) {
        this.cdplayer = cdplayer;
    }

    @Override
    public void execute() {
        cdplayer.stop();
    }

    @Override
    public void undo() {
        cdplayer.play();
    }
}

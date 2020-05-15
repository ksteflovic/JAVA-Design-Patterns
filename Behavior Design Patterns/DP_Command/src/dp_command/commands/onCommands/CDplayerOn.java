package dp_command.commands.onCommands;

import dp_command.commands.Command;
import dp_command.gadgets.CDplayer;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 15:58
 */
public class CDplayerOn implements Command {

    CDplayer cdplayer;

    public CDplayerOn(CDplayer cdplayer) {
        this.cdplayer = cdplayer;
    }

    @Override
    public void execute() {
        cdplayer.on();
    }

    @Override
    public void undo() {
        cdplayer.off();
    }
}

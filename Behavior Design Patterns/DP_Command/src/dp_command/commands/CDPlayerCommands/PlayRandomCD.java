package dp_command.commands.CDPlayerCommands;

import dp_command.commands.Command;
import dp_command.gadgets.CDplayer;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 12:50
 */
public class PlayRandomCD implements Command {

    private CDplayer cdp;
    private int predchCD;

    public PlayRandomCD(CDplayer cdp) {
        this.cdp = cdp;
    }

    public void execute() {
        predchCD = cdp.getCD();
        cdp.random();
        cdp.play();
    }

    public void undo() {
        cdp.setCD(predchCD);
        cdp.play();
    }

}
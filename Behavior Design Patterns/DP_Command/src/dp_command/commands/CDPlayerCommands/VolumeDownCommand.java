package dp_command.commands.CDPlayerCommands;

import dp_command.commands.Command;
import dp_command.gadgets.CDplayer;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 14:54
 */
public class VolumeDownCommand implements Command {

    private CDplayer cdplayer;
    int last_volume;

    public VolumeDownCommand(CDplayer cdplayer) {
        this.cdplayer = cdplayer;
    }

    @Override
    public void execute() {
        last_volume = cdplayer.getVolume();
        cdplayer.volumeDown();
    }

    @Override
    public void undo() {
        if(last_volume != cdplayer.getVolume())
            cdplayer.volumeUp();
    }
}
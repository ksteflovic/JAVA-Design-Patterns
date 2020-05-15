package dp_command.home;

import dp_command.commands.Command;
import dp_command.gadgets.CDplayer;
import dp_command.gadgets.GarageDoor;
import dp_command.gadgets.Lamp;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 12:03
 */
public class HomeArrive implements Command {

    private GarageDoor garageDoor;
    private Lamp lamp;
    private CDplayer cdplayer;

    public HomeArrive(GarageDoor garageDoor, Lamp lamp, CDplayer cdplayer) {
        this.garageDoor = garageDoor;
        this.lamp = lamp;
        this.cdplayer = cdplayer;
    }

    public void execute() {
        garageDoor.open();
        lamp.on();
        cdplayer.on();
        cdplayer.play();
        cdplayer.volumeUp();
     }

    public void undo() {
        garageDoor.close();
        lamp.off();
        cdplayer.off();
    }

}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_command;

import dp_command.commands.CDPlayerCommands.CDplayerPlay;
import dp_command.commands.CDPlayerCommands.CDplayerStop;
import dp_command.commands.offCommands.CDplayerOff;
import dp_command.commands.offCommands.GarageDoorOff;
import dp_command.commands.offCommands.LampOff;
import dp_command.commands.offCommands.ShutterOff;
import dp_command.commands.onCommands.CDplayerOn;
import dp_command.commands.onCommands.GarageDoorOn;
import dp_command.commands.onCommands.LampOn;
import dp_command.commands.onCommands.ShutterOn;
import dp_command.gadgets.CDplayer;
import dp_command.gadgets.GarageDoor;
import dp_command.gadgets.Lamp;
import dp_command.gadgets.Shutter;

/**
 *
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
        Remote_Control rc = new Remote_Control();
        Lamp lamp = new Lamp();
        Command cmd1 = new LampOn(lamp);
        Command cmd2 = new LampOff(lamp);
        rc.setCommand(cmd1, cmd2);
        rc.onBtnPressed();
        rc.offBtnPressed();
*/
        Big_Remote_Control brc = new Big_Remote_Control(5);
        Lamp lamp = new Lamp();
        CDplayer cdplayer = new CDplayer();
        GarageDoor garage = new GarageDoor();
        Shutter shutter = new Shutter();

        LampOn lampOn = new LampOn(lamp);
        LampOff lampOff = new LampOff(lamp);

        CDplayerOn cdplayerOn = new CDplayerOn(cdplayer);
        CDplayerOff cdplayerOff = new CDplayerOff(cdplayer);
        CDplayerPlay cdplayerPlay = new CDplayerPlay(cdplayer);
        CDplayerStop cdplayerStop = new CDplayerStop(cdplayer);


        GarageDoorOn garageDoorOn = new GarageDoorOn(garage);
        GarageDoorOff garageDoorOff = new GarageDoorOff(garage);

        ShutterOn shutterOn = new ShutterOn(shutter);
        ShutterOff shutterOff = new ShutterOff(shutter);

        brc.setCommand(0, lampOn, lampOff);
        brc.setCommand(1, cdplayerOn, cdplayerOff);
        brc.setCommand(2, cdplayerPlay, cdplayerStop);
        brc.setCommand(3, garageDoorOn, garageDoorOff);
        brc.setCommand(4, shutterOn, shutterOff);

        System.out.println("------ Remote control \uD83D\uDCF4 ------");
        brc.onButtonWasPushed(1);
        brc.onButtonWasPushed(2);


    }
}

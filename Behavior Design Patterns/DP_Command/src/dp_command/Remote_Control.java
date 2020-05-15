/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_command;

import dp_command.commands.Command;
import dp_command.commands.NoCommand;

/**
 *
 * @author KI
 */
public class Remote_Control {

    private Command onBtn;
    private Command offBtn;

    public Remote_Control() {
        Command nc = new NoCommand();
        onBtn = offBtn = nc;
    }

    public void setCommand(Command onCmd, Command offCmd) {
        onBtn = onCmd;
        offBtn = offCmd;
    }

    public void onBtnPressed() {
        onBtn.execute();
    }

    public void offBtnPressed() {
        offBtn.execute();
    }
}

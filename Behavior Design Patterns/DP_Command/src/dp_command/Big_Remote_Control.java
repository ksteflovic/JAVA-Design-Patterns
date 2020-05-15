package dp_command;

import dp_command.commands.Command;
import dp_command.commands.NoCommand;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 11:51
 */
public class Big_Remote_Control {

    private Command[] onBtns;
    private Command[] offBtns;
    private Command undoBtn;

    public Big_Remote_Control(int btnCount) {
        NoCommand nc = new NoCommand();

        onBtns = new Command[btnCount];
        offBtns = new Command[btnCount];

        for (int i = 0; i < btnCount; i++) {
            onBtns[i] = nc;
            offBtns[i] = nc;
        }

        undoBtn = nc;
    }

    public void setCommand(int index, Command oncommand, Command offCommand) {
        onBtns[index] = oncommand;
        offBtns[index] = offCommand;
    }

    public void onButtonWasPushed(int index) {
        undoBtn = onBtns[index];
        onBtns[index].execute();
    }

    public void offButtonWasPushed(int index) {
        undoBtn = offBtns[index];
        offBtns[index].execute();
    }

    public void undoButtonPushed(){
        undoBtn.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control \uD83D\uDCF4 --------\n");
        stringBuff.append("|                                         |\n");
        stringBuff.append("|                                         |\n");
        for (int i = 0; i < onBtns.length; i++) {
            stringBuff.append("|" + i + " " + onBtns[i].getClass().getName() + "   " + offBtns[i].getClass().getName() + "|\n");
        }
        stringBuff.append("|                                         |\n");
        stringBuff.append("|                                         |\n");
        stringBuff.append("|                                         |\n");
        stringBuff.append("-------------------------------------------\n");
        return stringBuff.toString();
    }
}

package dp_command.commands;

/**
 * @author Kristína Šteflovičová
 * @created 27.04.2020 - 20:22
 */
public class MacroCommand implements  Command{
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command c : commands)
            c.execute();
    }

    @Override
    public void undo() {
        for(Command c : commands)
            c.undo();
    }
}

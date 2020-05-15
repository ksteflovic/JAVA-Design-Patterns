/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_command.commands;

/**
 *
 * @author KI
 */
public interface Command {
    public void execute();
    public void undo();
}

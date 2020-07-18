package org.thermoweb.designpatterns.command.remotecontrol.remotes;

import org.thermoweb.designpatterns.command.remotecontrol.commands.Command;
import org.thermoweb.designpatterns.command.remotecontrol.commands.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------- Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot ");
            stringBuilder.append(i);
            stringBuilder.append("] ");
            stringBuilder.append(onCommands[i].getClass().getName());
            stringBuilder.append("             ");
            stringBuilder.append(offCommands[i].getClass().getName());
            stringBuilder.append("\n");
        }
        stringBuilder.append("[undo slot] ");
        stringBuilder.append(undoCommand.getClass().getName());

        return stringBuilder.toString();
    }
}

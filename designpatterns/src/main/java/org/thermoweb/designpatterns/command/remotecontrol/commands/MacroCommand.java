package org.thermoweb.designpatterns.command.remotecontrol.commands;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command... commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {

    }
}

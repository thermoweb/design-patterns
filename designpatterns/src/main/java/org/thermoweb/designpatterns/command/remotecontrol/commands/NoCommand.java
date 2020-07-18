package org.thermoweb.designpatterns.command.remotecontrol.commands;

import org.thermoweb.designpatterns.command.remotecontrol.commands.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("does nothing");
    }

    @Override
    public void undo() {
        System.out.println("undo nothing");
    }
}

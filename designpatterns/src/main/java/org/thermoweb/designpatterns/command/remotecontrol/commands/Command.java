package org.thermoweb.designpatterns.command.remotecontrol.commands;

public interface Command {
    public void execute();
    public void undo();
}

package org.thermoweb.designpatterns.command.remotecontrol.commands;

public interface Command {
    void execute();
    void undo();
}

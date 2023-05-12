package org.thermoweb.designpatterns.command.remotecontrol.commands;

import org.thermoweb.designpatterns.command.remotecontrol.receivers.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}

package org.thermoweb.designpatterns.command.remotecontrol.commands;

import org.thermoweb.designpatterns.command.remotecontrol.receivers.CeilingFan;

public class CeilingFanOffCommand implements Command {
    private final CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}

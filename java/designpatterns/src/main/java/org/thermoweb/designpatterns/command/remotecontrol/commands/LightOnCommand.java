package org.thermoweb.designpatterns.command.remotecontrol.commands;

import org.thermoweb.designpatterns.command.remotecontrol.receivers.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

package org.thermoweb.designpatterns.command.remotecontrol.commands;

import org.thermoweb.designpatterns.command.remotecontrol.receivers.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

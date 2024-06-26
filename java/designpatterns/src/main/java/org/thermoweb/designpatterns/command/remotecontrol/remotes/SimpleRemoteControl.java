package org.thermoweb.designpatterns.command.remotecontrol.remotes;

import org.thermoweb.designpatterns.command.remotecontrol.commands.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

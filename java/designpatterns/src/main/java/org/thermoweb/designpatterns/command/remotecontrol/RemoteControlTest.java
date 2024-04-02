package org.thermoweb.designpatterns.command.remotecontrol;

import org.thermoweb.designpatterns.command.remotecontrol.commands.LightOnCommand;
import org.thermoweb.designpatterns.command.remotecontrol.receivers.Light;
import org.thermoweb.designpatterns.command.remotecontrol.remotes.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("light");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}

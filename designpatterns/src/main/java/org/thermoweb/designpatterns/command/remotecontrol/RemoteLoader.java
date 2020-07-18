package org.thermoweb.designpatterns.command.remotecontrol;

import org.thermoweb.designpatterns.command.remotecontrol.commands.CeilingFanOffCommand;
import org.thermoweb.designpatterns.command.remotecontrol.commands.CeilingFanOnCommand;
import org.thermoweb.designpatterns.command.remotecontrol.commands.GarageDoorDownCommand;
import org.thermoweb.designpatterns.command.remotecontrol.commands.GarageDoorUpCommand;
import org.thermoweb.designpatterns.command.remotecontrol.commands.LightOffCommand;
import org.thermoweb.designpatterns.command.remotecontrol.commands.LightOnCommand;
import org.thermoweb.designpatterns.command.remotecontrol.commands.MacroCommand;
import org.thermoweb.designpatterns.command.remotecontrol.commands.NoCommand;
import org.thermoweb.designpatterns.command.remotecontrol.receivers.CeilingFan;
import org.thermoweb.designpatterns.command.remotecontrol.receivers.GarageDoor;
import org.thermoweb.designpatterns.command.remotecontrol.receivers.Light;
import org.thermoweb.designpatterns.command.remotecontrol.receivers.Stereo;
import org.thermoweb.designpatterns.command.remotecontrol.remotes.RemoteControl;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        MacroCommand macroCommand = new MacroCommand(ceilingFanOnCommand, livingRoomLightOn, garageDoorUpCommand);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        remote.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remote.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);
        remote.setCommand(4, macroCommand, new NoCommand());

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        System.out.println(remote);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(4);
    }
}

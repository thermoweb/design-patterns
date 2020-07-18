package org.thermoweb.designpatterns.command.remotecontrol.receivers;

public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Light " + name + " is on");
    }

    public void off() {
        System.out.println("Light " + name + " is off");
    }
}

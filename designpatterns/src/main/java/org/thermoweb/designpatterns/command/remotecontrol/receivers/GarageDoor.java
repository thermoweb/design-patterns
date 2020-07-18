package org.thermoweb.designpatterns.command.remotecontrol.receivers;

public class GarageDoor {
    private String name;
    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door is closed");
    }
}

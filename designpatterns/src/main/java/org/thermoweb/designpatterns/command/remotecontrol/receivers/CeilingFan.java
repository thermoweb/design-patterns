package org.thermoweb.designpatterns.command.remotecontrol.receivers;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String name;
    private int speed;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void slow() {
        speed = LOW;
    }

    public void on() {
        System.out.println("Ceiling fan [" + name + "] is On");
    }

    public void off() {
        speed = OFF;
        System.out.println("Ceiling fan [" + name + "] is Off");
    }

    public int getSpeed() {
        return speed;
    }
}

package org.thermoweb.designpatterns.facade;

public class Amplifier {
    public void on() {
        System.out.println("amplifier on");
    }

    public void setVolume(int i) {
        System.out.println("setting volume to " + i);
    }

    public void off() {
        System.out.println("amplifier off");
    }
}

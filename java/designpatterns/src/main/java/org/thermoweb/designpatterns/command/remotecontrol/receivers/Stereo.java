package org.thermoweb.designpatterns.command.remotecontrol.receivers;

public class Stereo {
    private int volume;

    public void on() {
        System.out.println("stereo is on");
    }

    public void setCD() {
    }

    public void setVolume(int i) {
        this.volume = i;
    }

    public void off() {
        System.out.println("stereo is off");
    }
}

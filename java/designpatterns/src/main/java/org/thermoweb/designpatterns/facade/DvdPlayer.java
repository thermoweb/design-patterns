package org.thermoweb.designpatterns.facade;

public class DvdPlayer {
    public void on() {
        System.out.println("dvd player on");
    }

    public void play(String movie) {
        System.out.println("playing movie : " + movie);
    }

    public void stop() {
        System.out.println("movie stopped");
    }

    public void eject() {
        System.out.println("dvd ejected");
    }

    public void off() {
        System.out.println("dvd player is off");
    }
}

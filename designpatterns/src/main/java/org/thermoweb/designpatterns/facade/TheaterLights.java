package org.thermoweb.designpatterns.facade;

public class TheaterLights {
    public void dim(int i) {
        System.out.println("dimming lights to " + i + " level");
    }

    public void on() {
        System.out.println("lights are full on");
    }
}

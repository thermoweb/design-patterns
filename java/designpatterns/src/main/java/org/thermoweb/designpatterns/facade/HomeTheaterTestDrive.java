package org.thermoweb.designpatterns.facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, popper, lights, screen);
        homeTheater.watchMovie("12 hommes en colère");
        homeTheater.endMovie();
    }
}

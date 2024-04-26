package fr.yagni.facade.hometheater;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    PopcornPopper popper;
    TheaterLights lights;
    Screen screen;

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             DvdPlayer dvdPlayer,
                             PopcornPopper popper,
                             TheaterLights lights,
                             Screen screen) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.popper = popper;
        this.lights = lights;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}

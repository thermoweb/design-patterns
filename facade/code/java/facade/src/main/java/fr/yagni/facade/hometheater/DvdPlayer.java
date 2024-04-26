package fr.yagni.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DvdPlayer {
    public void on() {
        log.atInfo().log("dvd player on");
    }

    public void play(String movie) {
        log.atInfo().log("playing movie : " + movie);
    }

    public void stop() {
        log.atInfo().log("movie stopped");
    }

    public void eject() {
        log.atInfo().log("dvd ejected");
    }

    public void off() {
        log.atInfo().log("dvd player is off");
    }
}

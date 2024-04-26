package fr.yagni.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TheaterLights {
    public void dim(int i) {
        log.atInfo().log("dimming lights to " + i + " level");
    }

    public void on() {
        log.atInfo().log("lights are full on");
    }
}

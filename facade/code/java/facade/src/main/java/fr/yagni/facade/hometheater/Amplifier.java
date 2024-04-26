package fr.yagni.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Amplifier {

    public void on() {
        log.atInfo().log("amplifier on");
    }

    public void setVolume(int i) {
        log.atInfo().log("setting volume to " + i);
    }

    public void off() {
        log.atInfo().log("amplifier off");
    }
}

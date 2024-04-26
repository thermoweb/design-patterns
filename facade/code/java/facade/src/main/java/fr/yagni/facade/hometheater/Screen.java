package fr.yagni.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Screen {
    public void down() {
        log.atInfo().log("screen moving down");
    }

    public void up() {
        log.atInfo().log("screen movung up");
    }
}

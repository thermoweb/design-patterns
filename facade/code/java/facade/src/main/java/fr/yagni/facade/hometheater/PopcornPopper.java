package fr.yagni.facade.hometheater;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PopcornPopper {
    public void on() {
        log.atInfo().log("turning on popcorn popper");
    }

    public void pop() {
        log.atInfo().log("popping some popcorn");
    }

    public void off() {
        log.atInfo().log("turning off popcorn popper");
    }
}

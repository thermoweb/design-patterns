package org.thermoweb.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        log.atInfo().log("Gobble gobble");
    }

    @Override
    public void fly() {
        log.atInfo().log("I'm flying a short distance");
    }
}

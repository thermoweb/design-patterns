package org.thermoweb.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        log.atInfo().log("Quack");
    }

    @Override
    public void fly() {
        log.atInfo().log("I'm flying");
    }
}

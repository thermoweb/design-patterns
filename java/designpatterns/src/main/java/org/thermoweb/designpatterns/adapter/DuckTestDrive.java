package org.thermoweb.designpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        log.atInfo().log("The turkey says...");
        turkey.gobble();
        turkey.fly();

        log.atInfo().log("The duck says...");
        testDuck(duck);

        log.atInfo().log("The turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

package org.thermoweb.designpatterns.strategy.ducksimulator.behavior.quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

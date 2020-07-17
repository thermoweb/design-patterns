package org.thermoweb.designpatterns.strategy.ducksimulator.behavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

package org.thermoweb.designpatterns.strategy.ducksimulator.behavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}

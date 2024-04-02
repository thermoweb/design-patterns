package org.thermoweb.designpatterns.strategy.ducksimulator.behavior.quack;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}

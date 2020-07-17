package org.thermoweb.designpatterns.strategy.ducksimulator.behavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack !");
    }
}

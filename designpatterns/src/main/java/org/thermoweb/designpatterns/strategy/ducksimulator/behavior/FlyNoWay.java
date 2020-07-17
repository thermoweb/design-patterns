package org.thermoweb.designpatterns.strategy.ducksimulator.behavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}

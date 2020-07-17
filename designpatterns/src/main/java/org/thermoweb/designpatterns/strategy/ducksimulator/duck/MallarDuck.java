package org.thermoweb.designpatterns.strategy.ducksimulator.duck;

import org.thermoweb.designpatterns.strategy.ducksimulator.behavior.FlyWithWings;
import org.thermoweb.designpatterns.strategy.ducksimulator.behavior.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

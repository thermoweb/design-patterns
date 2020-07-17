package org.thermoweb.designpatterns.strategy.ducksimulator.duck;

import org.thermoweb.designpatterns.strategy.ducksimulator.behavior.fly.FlyWithWings;
import org.thermoweb.designpatterns.strategy.ducksimulator.behavior.quack.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

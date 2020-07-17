package org.thermoweb.designpatterns.ducks.duck;

import org.thermoweb.designpatterns.ducks.behavior.FlyWithWings;
import org.thermoweb.designpatterns.ducks.behavior.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

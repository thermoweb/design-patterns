package org.thermoweb.designpatterns.strategy.ducksimulator.duck;

import org.thermoweb.designpatterns.strategy.ducksimulator.behavior.fly.FlyNoWay;
import org.thermoweb.designpatterns.strategy.ducksimulator.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}

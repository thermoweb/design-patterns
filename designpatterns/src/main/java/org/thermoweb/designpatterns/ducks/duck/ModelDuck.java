package org.thermoweb.designpatterns.ducks.duck;

import org.thermoweb.designpatterns.ducks.behavior.FlyNoWay;
import org.thermoweb.designpatterns.ducks.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}

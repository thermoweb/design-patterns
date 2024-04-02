package org.thermoweb.designpatterns.strategy.ducksimulator.duck;

import org.thermoweb.designpatterns.strategy.ducksimulator.behavior.fly.FlyBehavior;
import org.thermoweb.designpatterns.strategy.ducksimulator.behavior.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All strategy float, even decoys!");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}

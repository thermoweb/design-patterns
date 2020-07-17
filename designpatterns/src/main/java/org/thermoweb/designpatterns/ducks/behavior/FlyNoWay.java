package org.thermoweb.designpatterns.ducks.behavior;

import org.thermoweb.designpatterns.ducks.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}

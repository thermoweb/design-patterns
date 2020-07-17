package org.thermoweb.designpatterns.ducks.behavior;

import org.thermoweb.designpatterns.ducks.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("I'm Flying!!");
    }
}

package org.thermoweb.designpatterns.ducks.behavior;

import org.thermoweb.designpatterns.ducks.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}

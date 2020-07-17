package org.thermoweb.designpatterns.ducks.behavior;

import org.thermoweb.designpatterns.ducks.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack !");
    }
}

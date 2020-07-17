package org.thermoweb.designpatterns.ducks.behavior;

import org.thermoweb.designpatterns.ducks.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

package org.thermoweb.designpatterns.ducks;

import org.thermoweb.designpatterns.ducks.behavior.FlyRocketPowered;
import org.thermoweb.designpatterns.ducks.duck.Duck;
import org.thermoweb.designpatterns.ducks.duck.MallarDuck;
import org.thermoweb.designpatterns.ducks.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

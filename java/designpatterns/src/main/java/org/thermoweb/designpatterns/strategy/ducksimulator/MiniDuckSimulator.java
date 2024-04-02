package org.thermoweb.designpatterns.strategy.ducksimulator;

import org.thermoweb.designpatterns.strategy.ducksimulator.behavior.fly.FlyRocketPowered;
import org.thermoweb.designpatterns.strategy.ducksimulator.duck.Duck;
import org.thermoweb.designpatterns.strategy.ducksimulator.duck.MallarDuck;
import org.thermoweb.designpatterns.strategy.ducksimulator.duck.ModelDuck;

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

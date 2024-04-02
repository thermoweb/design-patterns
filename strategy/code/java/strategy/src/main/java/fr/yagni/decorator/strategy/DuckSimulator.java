package fr.yagni.decorator.strategy;

import fr.yagni.decorator.strategy.fly.FlyWithWingsStrategy;
import fr.yagni.decorator.strategy.fly.NoFlyStrategy;
import fr.yagni.decorator.strategy.quack.NoQuackStrategy;
import fr.yagni.decorator.strategy.quack.SimpleQuackStrategy;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck rubberDuck = new Duck(new NoQuackStrategy(), new NoFlyStrategy());
        rubberDuck.quack();
        rubberDuck.fly();

        Duck simpleDuck = new Duck(new SimpleQuackStrategy(), new FlyWithWingsStrategy());
        simpleDuck.quack();
        simpleDuck.fly();
    }
}

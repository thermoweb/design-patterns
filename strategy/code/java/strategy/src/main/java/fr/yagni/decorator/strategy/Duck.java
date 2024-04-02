package fr.yagni.decorator.strategy;

import fr.yagni.decorator.strategy.fly.FlyStrategy;
import fr.yagni.decorator.strategy.quack.QuackStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Duck {
    private final QuackStrategy quackStrategy;
    private final FlyStrategy flyStrategy;

    public Duck(QuackStrategy quackStrategy, FlyStrategy flyStrategy) {
        this.quackStrategy = quackStrategy;
        this.flyStrategy = flyStrategy;
    }

    public void quack() {
        log.atInfo().log(quackStrategy.quack());
    }

    public void fly() {
        log.atInfo().log(flyStrategy.fly());
    }
}

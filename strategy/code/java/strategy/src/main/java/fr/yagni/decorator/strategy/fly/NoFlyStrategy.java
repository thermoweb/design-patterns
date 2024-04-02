package fr.yagni.decorator.strategy.fly;

public class NoFlyStrategy implements FlyStrategy {
    @Override
    public String fly() {
        return "I can't fly";
    }
}

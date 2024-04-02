package fr.yagni.decorator.strategy.quack;

public class SimpleQuackStrategy implements QuackStrategy {
    @Override
    public String quack() {
        return "Quack !";
    }
}

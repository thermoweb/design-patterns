package fr.yagni.decorator.strategy.quack;

public class NoQuackStrategy implements QuackStrategy {
    @Override
    public String quack() {
        return "I can't quack";
    }
}

package fr.yagni.decorator.cakefactory.toppings;

import fr.yagni.decorator.cakefactory.cakes.Cake;

public class Chocolate implements Topping {
    private final Cake onTopOf;
    public Chocolate(Cake cake) {
        this.onTopOf = cake;
    }

    @Override
    public Cake onTopOf() {
        return onTopOf;
    }

    @Override
    public String name() {
        return "chocolate";
    }
}

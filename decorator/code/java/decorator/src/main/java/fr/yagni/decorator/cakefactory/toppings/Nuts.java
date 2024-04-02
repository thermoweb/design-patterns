package fr.yagni.decorator.cakefactory.toppings;

import fr.yagni.decorator.cakefactory.cakes.Cake;

public class Nuts implements Topping {

    private final Cake onTopOf;

    public Nuts(Cake cake) {
        this.onTopOf = cake;
    }

    @Override
    public Cake onTopOf() {
        return onTopOf;
    }

    @Override
    public String name() {
        return "nuts";
    }
}

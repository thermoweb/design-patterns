package fr.yagni.decorator.cakefactory.toppings;

import fr.yagni.decorator.cakefactory.cakes.Cake;

public class Caramel implements Topping {

    private final Cake onTopOf;

    public Caramel(Cake cake) {
        this.onTopOf = cake;
    }
    @Override
    public Cake onTopOf() {
        return onTopOf;
    }

    @Override
    public String name() {
        return "caramel";
    }
}

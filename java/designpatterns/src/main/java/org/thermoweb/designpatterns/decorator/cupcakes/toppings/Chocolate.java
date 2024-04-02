package org.thermoweb.designpatterns.decorator.cupcakes.toppings;

import org.thermoweb.designpatterns.decorator.cupcakes.cakes.Cake;

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

package fr.yagni.decorator.cakefactory.toppings;

import fr.yagni.decorator.cakefactory.cakes.Cake;

public interface Topping extends Cake {

    Cake onTopOf();

    String name();

    @Override
    default String fullname() {
        Cake onTop = onTopOf();
        if (onTop instanceof Topping topping) {
            return topping.fullname() + " and " + name();
        }
        return onTopOf().fullname() + " with " + name();
    }
}

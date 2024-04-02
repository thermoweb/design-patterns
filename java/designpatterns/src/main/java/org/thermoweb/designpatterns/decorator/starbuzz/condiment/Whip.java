package org.thermoweb.designpatterns.decorator.starbuzz.condiment;

import org.thermoweb.designpatterns.decorator.starbuzz.beverage.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}

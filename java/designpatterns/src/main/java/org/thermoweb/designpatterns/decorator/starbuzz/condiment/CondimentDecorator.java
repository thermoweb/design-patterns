package org.thermoweb.designpatterns.decorator.starbuzz.condiment;

import org.thermoweb.designpatterns.decorator.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

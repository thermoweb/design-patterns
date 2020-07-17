package org.thermoweb.designpatterns.decorator.starbuzz;

import org.thermoweb.designpatterns.decorator.starbuzz.beverage.Beverage;
import org.thermoweb.designpatterns.decorator.starbuzz.beverage.Expresso;
import org.thermoweb.designpatterns.decorator.starbuzz.beverage.HouseBlend;
import org.thermoweb.designpatterns.decorator.starbuzz.condiment.Mocha;
import org.thermoweb.designpatterns.decorator.starbuzz.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage expresso = new Expresso();
        System.out.println(expresso.getDescription()
            + " $" + expresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription()
            + " $" + houseBlend.cost());
    }
}

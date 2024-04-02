package org.thermoweb.designpatterns.decorator.starbuzz;

import org.thermoweb.designpatterns.decorator.starbuzz.beverage.Beverage;
import org.thermoweb.designpatterns.decorator.starbuzz.beverage.Expresso;
import org.thermoweb.designpatterns.decorator.starbuzz.beverage.HouseBlend;
import org.thermoweb.designpatterns.decorator.starbuzz.condiment.Mocha;
import org.thermoweb.designpatterns.decorator.starbuzz.condiment.Whip;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage expresso = new Expresso();
        log.atInfo().log(expresso.getDescription()
                + " $" + expresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        log.atInfo().log(houseBlend.getDescription()
                + " $" + houseBlend.cost());
    }
}

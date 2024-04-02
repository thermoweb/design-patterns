package org.thermoweb.designpatterns.decorator.cupcakes;

import org.thermoweb.designpatterns.decorator.cupcakes.cakes.Cake;
import org.thermoweb.designpatterns.decorator.cupcakes.cakes.Cookie;
import org.thermoweb.designpatterns.decorator.cupcakes.cakes.CupCake;
import org.thermoweb.designpatterns.decorator.cupcakes.toppings.Caramel;
import org.thermoweb.designpatterns.decorator.cupcakes.toppings.Chocolate;
import org.thermoweb.designpatterns.decorator.cupcakes.toppings.Nuts;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CakeFactoryApp {
    public static void main(String[] args) {
        Cake chocolateCupCake = new Chocolate(new CupCake());
        log.atInfo().log(chocolateCupCake.fullname());

        Cake cupcakeWithChocolateAndNuts = new Nuts(new Chocolate(new CupCake()));
        log.atInfo().log(cupcakeWithChocolateAndNuts.fullname());

        Cake ultimateCookie = new Caramel(new Nuts(new Chocolate(new Cookie())));
        log.atInfo().log(ultimateCookie.fullname());
    }
}

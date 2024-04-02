package fr.yagni.decorator.cakefactory;

import fr.yagni.decorator.cakefactory.cakes.Cake;
import fr.yagni.decorator.cakefactory.cakes.Cookie;
import fr.yagni.decorator.cakefactory.cakes.CupCake;
import fr.yagni.decorator.cakefactory.toppings.Caramel;
import fr.yagni.decorator.cakefactory.toppings.Chocolate;
import fr.yagni.decorator.cakefactory.toppings.Nuts;
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

package fr.yagni.decorator.cakefactory;


import org.junit.jupiter.api.Test;

import fr.yagni.decorator.cakefactory.cakes.Cake;
import fr.yagni.decorator.cakefactory.cakes.Cookie;
import fr.yagni.decorator.cakefactory.toppings.Caramel;
import fr.yagni.decorator.cakefactory.toppings.Chocolate;
import fr.yagni.decorator.cakefactory.toppings.Nuts;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CakeFactoryAppTest {

    @Test
    void should_printCorrectly_when_createCakeWithToppings() {
        Cake cake = new Caramel(new Nuts(new Chocolate(new Cookie())));
        assertEquals("cookie with chocolate and nuts and caramel", cake.fullname());
    }
}
package org.thermoweb.designpatterns.factory.pizzastore.store;

import org.thermoweb.designpatterns.factory.pizzastore.pizza.CheesePizza;
import org.thermoweb.designpatterns.factory.pizzastore.pizza.PepperoniPizza;
import org.thermoweb.designpatterns.factory.pizzastore.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new PepperoniPizza();
        }

        return null;
    }
}

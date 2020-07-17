package org.thermoweb.designpatterns.factory.pizzastore.store;

import org.thermoweb.designpatterns.factory.pizzastore.pizza.ChicagoCheesePizza;
import org.thermoweb.designpatterns.factory.pizzastore.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoCheesePizza();
        }
        return null;
    }
}

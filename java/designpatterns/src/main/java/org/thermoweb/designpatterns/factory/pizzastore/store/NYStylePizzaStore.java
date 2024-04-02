package org.thermoweb.designpatterns.factory.pizzastore.store;

import org.thermoweb.designpatterns.factory.pizzastore.ingredients.factory.NYPizzaIngredientFactory;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.factory.PizzaIngredientFactory;
import org.thermoweb.designpatterns.factory.pizzastore.pizza.CheesePizza;
import org.thermoweb.designpatterns.factory.pizzastore.pizza.ClamPizza;
import org.thermoweb.designpatterns.factory.pizzastore.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {


    @Override
    Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}

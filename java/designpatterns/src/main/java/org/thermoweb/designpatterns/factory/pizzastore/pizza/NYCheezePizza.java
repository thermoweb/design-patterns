package org.thermoweb.designpatterns.factory.pizzastore.pizza;

public class NYCheezePizza extends Pizza {

    @Override
    public void prepare() {

    }

    public NYCheezePizza() {
        name = "NY Style Sauce and Cheese Pizza";

        toppings.add("Grated Reggiano Cheese");
    }
}

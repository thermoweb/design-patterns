package org.thermoweb.designpatterns.factory.pizzastore.pizza;

public class NYCheezePizza extends Pizza {

    public NYCheezePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

package org.thermoweb.designpatterns.factory.pizzastore.pizza;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void prepare() {

    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

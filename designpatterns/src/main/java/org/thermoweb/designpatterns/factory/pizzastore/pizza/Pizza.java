package org.thermoweb.designpatterns.factory.pizzastore.pizza;

import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Cheese;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Clams;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Dough;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Pepperoni;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Sauce;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Veggies;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    ArrayList<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package org.thermoweb.designpatterns.factory.pizzastore;

import org.thermoweb.designpatterns.factory.pizzastore.pizza.Pizza;
import org.thermoweb.designpatterns.factory.pizzastore.store.ChicagoStylePizzaStore;
import org.thermoweb.designpatterns.factory.pizzastore.store.NYStylePizzaStore;
import org.thermoweb.designpatterns.factory.pizzastore.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan order a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ethan order a " + pizza.getName());

    }
}

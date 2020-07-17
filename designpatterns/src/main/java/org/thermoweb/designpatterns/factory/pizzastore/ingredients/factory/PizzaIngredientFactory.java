package org.thermoweb.designpatterns.factory.pizzastore.ingredients.factory;

import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Cheese;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Clams;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Dough;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Pepperoni;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Sauce;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
    Cheese createCheese();
}

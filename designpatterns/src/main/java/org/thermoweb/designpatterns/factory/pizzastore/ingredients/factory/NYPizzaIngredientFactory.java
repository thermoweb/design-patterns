package org.thermoweb.designpatterns.factory.pizzastore.ingredients.factory;

import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Cheese;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Clams;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Dough;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Garlic;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.MarinaraSauce;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Onion;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Pepperoni;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.RedPepper;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Sauce;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.SlicedPepperoni;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.ThinCrustDough;
import org.thermoweb.designpatterns.factory.pizzastore.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}

package org.thermoweb.designpatterns.factory.pizzastore.pizza;

import org.thermoweb.designpatterns.factory.pizzastore.ingredients.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
}

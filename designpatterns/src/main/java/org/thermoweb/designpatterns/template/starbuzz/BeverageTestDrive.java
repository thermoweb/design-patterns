package org.thermoweb.designpatterns.template.starbuzz;

public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("Making tea");
        teaHook.prepareRecipe();

        System.out.println("Making coffee");
        coffeeHook.prepareRecipe();
    }
}

package org.thermoweb.designpatterns.iterator;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}

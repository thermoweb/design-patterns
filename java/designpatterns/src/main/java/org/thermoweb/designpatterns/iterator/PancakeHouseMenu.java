package org.thermoweb.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList menuItems;
    PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast",
                "Pancake with scrambled eggs, and toast",
                true,
                2.99);
        addItem("K&B's Muffin Breakfast",
                "muffin with chocolate and stuff",
                true,
                4.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem =new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}

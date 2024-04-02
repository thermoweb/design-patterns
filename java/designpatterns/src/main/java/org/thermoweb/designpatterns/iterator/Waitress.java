package org.thermoweb.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

class Waitress {
    private ArrayList menus;

    Waitress(ArrayList menus) {
        this.menus = menus;
    }

    void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(java.util.Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}

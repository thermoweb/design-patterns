package org.thermoweb.designpatterns.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("you can't remove an item until you've done at least one next()");
        }

        if (items[position-1] != null) {
            for (int i = position-1; i < (items.length-1); i++) {
                items[i] = items[+1];
            }
            items[items.length-1] = null;
        }
    }
}

package org.thermoweb.designpatterns.strategy.dungeon.character;

import org.thermoweb.designpatterns.strategy.dungeon.weapons.SwordStrategy;

public class Knight extends Character {

    public Knight() {
        this.weapon = new SwordStrategy();
    }
}

package org.thermoweb.designpatterns.strategy.dungeon.character;

import org.thermoweb.designpatterns.strategy.dungeon.weapons.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        this.weapon = new AxeBehavior();
    }
}

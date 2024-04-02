package org.thermoweb.designpatterns.strategy.dungeon.character;

import org.thermoweb.designpatterns.strategy.dungeon.weapons.SwordBehavior;

public class King extends Character {

    public King() {
        this.weapon = new SwordBehavior();
    }
}

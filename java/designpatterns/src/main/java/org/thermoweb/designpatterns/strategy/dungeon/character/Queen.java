package org.thermoweb.designpatterns.strategy.dungeon.character;

import org.thermoweb.designpatterns.strategy.dungeon.weapons.KnifeStrategy;

public class Queen extends Character {

    public Queen() {
        this.weapon = new KnifeStrategy();
    }
}

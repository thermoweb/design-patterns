package org.thermoweb.designpatterns.strategy.dungeon;

import org.thermoweb.designpatterns.strategy.dungeon.character.Character;
import org.thermoweb.designpatterns.strategy.dungeon.character.King;
import org.thermoweb.designpatterns.strategy.dungeon.character.Troll;
import org.thermoweb.designpatterns.strategy.dungeon.weapons.BowAndArrowStrategy;

public class DungeonSim {

    public static void main(String[] args) {
        Character king = new King();
        Character troll = new Troll();
        troll.fight();
        king.fight();
        king.setWeapon(new BowAndArrowStrategy());
        king.fight();
    }
}

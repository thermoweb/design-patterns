package org.thermoweb.designpatterns.strategy.dungeon.weapons;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("use bow and arrow");
    }
}

package org.thermoweb.designpatterns.strategy.dungeon.weapons;

public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("use sword");
    }
}
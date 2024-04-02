package org.thermoweb.designpatterns.strategy.dungeon.weapons;

public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("use axe");
    }
}

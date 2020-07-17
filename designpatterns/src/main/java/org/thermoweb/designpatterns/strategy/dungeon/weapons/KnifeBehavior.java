package org.thermoweb.designpatterns.strategy.dungeon.weapons;

public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("use Knife");
    }
}

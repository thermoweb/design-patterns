package org.thermoweb.designpatterns.strategy.dungeon.character;

import org.thermoweb.designpatterns.strategy.dungeon.weapons.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weapon;

    public Character() {

    }

    public void fight() {
        this.weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}

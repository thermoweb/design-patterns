package org.thermoweb.designpatterns.strategy.dungeon.character;

import org.thermoweb.designpatterns.strategy.dungeon.weapons.WeaponStrategy;

import lombok.Setter;

@Setter
public abstract class Character {

    protected WeaponStrategy weapon;

    protected Character() {
    }

    public void fight() {
        this.weapon.useWeapon();
    }

}

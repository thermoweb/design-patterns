package org.thermoweb.designpatterns.strategy.dungeon.weapons;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AxeStrategy implements WeaponStrategy {
    public void useWeapon() {
        log.atInfo().log("use axe");
    }
}

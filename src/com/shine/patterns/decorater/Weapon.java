package com.shine.patterns.decorater;

/**
 * Created by sheng on 5/6/15.
 */
public abstract class Weapon extends Hero {
    private Hero hero;

    public Weapon(Hero h) {
        hero = h;
    }

    public int getTotalPower() {
        return super.getPower() + hero.getTotalPower();
    }

    public String getDecription() {
        return super.getDescription();
    }
}

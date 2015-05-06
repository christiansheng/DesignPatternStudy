package com.shine.patterns.decorater;

/**
 * Created by sheng on 5/6/15.
 */
public class TuLong extends Weapon {

    public TuLong(Hero hero) {
        super(hero);
        super.setPower(2000);
        super.setDescription(super.getDecription() + " with TuLongDao " + this.getTotalPower());
    }
}

package com.shine.patterns.decorater;

/**
 * Created by sheng on 5/6/15.
 */
public abstract class Hero {
    private String description = "";
    private int power = 0;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public abstract int getTotalPower();
}

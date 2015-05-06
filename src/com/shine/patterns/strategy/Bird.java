package com.shine.patterns.strategy;

import com.shine.patterns.io.IO;

/**
 * Created by csheng on 5/6/15.
 */
public abstract class Bird {
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;

    public Bird() {

    }

    public String fly() {
        return flyBehavior.fly();
    }

    public String swim() {
        return swimBehavior.swim();
    }

    public String layEggs() {
        return "can lay eggs ";
    }

    public void show() {
        IO.write(fly() + swim() + layEggs());
    }
}

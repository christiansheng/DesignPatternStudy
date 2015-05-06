package com.shine.patterns.strategy;

/**
 * Created by csheng on 5/6/15.
 */
public class Sparrow extends Bird {
    public Sparrow() {
        flyBehavior = new FlyBehaviorYes();
        swimBehavior = new SwimBehaviorNot();
    }
}

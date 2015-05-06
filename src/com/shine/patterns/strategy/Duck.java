package com.shine.patterns.strategy;

/**
 * Created by csheng on 5/6/15.
 */
public class Duck extends Bird {

    public Duck() {
        flyBehavior = new FlyBehaviorNot();
        swimBehavior = new SwimBehaviorYes();
    }
}

package com.shine.patterns.strategy;

/**
 * Created by csheng on 5/6/15.
 */
public class BirdTest {

    public static void main(String[] args) {

        Bird duck = new Duck();
        Sparrow sparrow = new Sparrow();
        duck.show();
        sparrow.show();
    }

}

package com.shine.patterns.singleton;

/**
 * Created by sheng on 5/6/15.
 */

public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
        // initializing
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}

package com.shine.patterns.singleton;

/**
 * Created by sheng on 5/6/15.
 */
public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() {
        // initializing
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

package com.shine.patterns.singleton;

/**
 * Created by csheng on 5/6/15.
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {
        // initializing
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}

package com.shine.patterns.singleton;

/**
 * Created by csheng on 5/6/15.
 */
public class Singleton4 {
    private static Singleton4 instance = null;

    private Singleton4() {
        // initializing
    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
                return instance;
            }
        }
        return instance;
    }
}

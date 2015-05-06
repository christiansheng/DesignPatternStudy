package com.shine.patterns.observer;

import com.shine.patterns.io.IO;

/**
 * Created by sheng on 5/7/15.
 */
public class Otaku implements Watcher {

    private String WeiboStatues;
    private String name;

    public Otaku() {

    }

    public Otaku(String name) {
        this.name = name;
    }

    public void update(String str) {
        this.WeiboStatues = str;
        IO.write(name + " get msg : " + str);
    }
}

package com.shine.patterns.io;

/**
 * Created by csheng on 5/6/15.
 */
public class IO {
    public static void write(String s) {
        System.out.println(s);
    }

    public static void write(String tag, String s) {
        write(tag + s);
    }
    public static void read() {
        //to do later
    }
}

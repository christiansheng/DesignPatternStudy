package com.shine.patterns.singleton;


/**
 * Created by csheng on 5/6/15.
 */
public class SingletonTests {

    public static void main(String[] args) {
        Singleton1 s11, s12;
        Singleton2 s21, s22;
        Singleton3 s31, s32;
        Singleton4 s41, s42;


        s11 = Singleton1.getInstance();
        s12 = Singleton1.getInstance();
        System.out.println(s11 == s12);

        s21 = Singleton2.getInstance();
        s22 = Singleton2.getInstance();
        System.out.println(s21 == s22);

        s31 = Singleton3.getInstance();
        s32 = Singleton3.getInstance();
        System.out.println(s31 == s32);

        s41 = Singleton4.getInstance();
        s42 = Singleton4.getInstance();
        System.out.println(s41 == s42);
    }

}

package com.shine.patterns.factory;

/**
 * Created by sheng on 5/6/15.
 */
public abstract class Operations {
    private int a;
    private int b;

    public Operations() {

    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public abstract int getResult();
}

package com.shine.patterns.factory;

/**
 * Created by sheng on 5/6/15.
 */
public class OperationDiv extends Operations {

    public OperationDiv() {
        super();
    }

    public int getResult() {
        return super.getA() / super.getB();
    }

}

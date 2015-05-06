package com.shine.patterns.factory;

/**
 * Created by sheng on 5/6/15.
 */
public class OperationMul extends Operations {
    public OperationMul() {
        super();
    }

    public int getResult() {
        return super.getA() * super.getB();
    }

}

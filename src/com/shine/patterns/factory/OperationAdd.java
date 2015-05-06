package com.shine.patterns.factory;


/**
 * Created by sheng on 5/6/15.
 */
public class OperationAdd extends Operations {


    public OperationAdd() {
        super();
    }

    public int getResult() {
        return super.getA() + super.getB();
    }

}

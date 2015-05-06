package com.shine.patterns.factory;

import com.sun.corba.se.spi.orb.Operation;

/**
 * Created by sheng on 5/6/15.
 */
public class OperationFactory {

    public static Operations OperationCreate(String op) throws IllegalAccessException, InstantiationException {
        try {
            return (Operations) Class.forName("com.shine.patterns.factory.Operation" + op).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}

package com.shine.patterns.factory;

import com.shine.patterns.io.IO;
import com.sun.corba.se.spi.orb.Operation;

/**
 * Created by sheng on 5/6/15.
 */
public class OperationTest {

    public static void main(String[] args) {
        Operations op = null;
        try {
            op = OperationFactory.OperationCreate("Add");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        op.setA(12);
        op.setB(13);
        IO.write(op.getResult() + "");

    }
}

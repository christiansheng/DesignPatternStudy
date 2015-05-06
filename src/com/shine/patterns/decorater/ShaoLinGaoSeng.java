package com.shine.patterns.decorater;

/**
 * Created by sheng on 5/6/15.
 */
public class ShaoLinGaoSeng extends DaXia {

    public ShaoLinGaoSeng(String name) {
        super.setDescription("ShaoLin: " + name);
        super.setPower(6000);
    }
}

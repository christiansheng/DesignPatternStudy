package com.shine.patterns.decorater;

/**
 * Created by sheng on 5/6/15.
 */
public class WuDangDaoShi extends DaXia {

    public WuDangDaoShi(String name) {
        super.setDescription("WuDang: " + name);
        super.setPower(6000);
    }
}

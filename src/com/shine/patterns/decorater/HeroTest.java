package com.shine.patterns.decorater;

import com.shine.patterns.io.IO;

/**
 * Created by sheng on 5/6/15.
 */
public class HeroTest {
    public static void main(String[] args) {
        Hero ZhangSanFang;
        ZhangSanFang = new WuDangDaoShi("ZhangSanFeng");
        IO.write(ZhangSanFang.getDescription());

        ZhangSanFang = new YiTian(ZhangSanFang);

        IO.write(ZhangSanFang.getDescription());
        ZhangSanFang = new TuLong(ZhangSanFang);

        IO.write(ZhangSanFang.getDescription());
        IO.write(ZhangSanFang.getPower() + "");

    }
}

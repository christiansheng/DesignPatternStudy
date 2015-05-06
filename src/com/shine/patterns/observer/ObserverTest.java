package com.shine.patterns.observer;

/**
 * Created by sheng on 5/7/15.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Gorgeous Linzhiling = new Gorgeous();
        Otaku zhainan1 = new Otaku("XiaoMing");
        Otaku zhainan2 = new Otaku("XiaoWang");
        Otaku zhainan3 = new Otaku("XiaoLing");

        Linzhiling.addWatcher(zhainan1);
        Linzhiling.addWatcher(zhainan2);
        Linzhiling.addWatcher(zhainan3);
        Linzhiling.setStatues("I'm gonna married!!!");
        Linzhiling.notifyAllWatchers();
    }
}

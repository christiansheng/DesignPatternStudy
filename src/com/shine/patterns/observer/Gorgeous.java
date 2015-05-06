package com.shine.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sheng on 5/7/15.
 */
public class Gorgeous implements Watched {
    private String Statues = "";
    public List<Watcher> watchers = new ArrayList<>();

    public void setStatues(String statues) {
        Statues = statues;
    }

    @Override
    public void addWatcher(Watcher watcher) {
        watchers.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }

    @Override
    public void notifyAllWatchers() {
        for (Watcher watcher : watchers) {
            watcher.update(Statues);
        }
    }
}

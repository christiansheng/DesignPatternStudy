package com.shine.patterns.observer;

/**
 * Created by sheng on 5/7/15.
 */
public interface Watched {
    void addWatcher(Watcher watcher);

    void removeWatcher(Watcher watcher);

    void notifyAllWatchers();

}

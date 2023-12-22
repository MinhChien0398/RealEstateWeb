package com.nhom44.services.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UserObserver {
    protected List<Watcher> watchers;
    protected UserObserver(){
        watchers= new ArrayList<>();
    }
    protected void addWatcher(Watcher watcher){
        watchers.add(watcher);
    }
    protected void deleteWatcher(Watcher watcher){
        watchers.remove(watcher);
    }
    protected void notifyObserver(){
        for (Watcher w:watchers
             ) {
            w.update();
        }
    }
}

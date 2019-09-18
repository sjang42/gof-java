package com.gof.observer.changemanager;

import com.gof.observer.domain.Observer;
import com.gof.observer.domain.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleChangeManager implements ChangeManager {
    private Map<Subject, ArrayList<Observer>> map;

    public SimpleChangeManager() {
        map = new HashMap<>();
    }

    @Override
    public void register(Subject s, Observer o) {
        if (!map.containsKey(s)) {
            map.put(s, new ArrayList<>());
        }
        map.get(s).add(o);
    }

    @Override
    public void unregister(Subject s, Observer o) {
        if (map.containsKey(s)) {
            map.get(s).remove(o);
        }
    }

    @Override
    public void notifyObservers(Subject s) {
        for (Observer o : map.get(s)) {
            o.update(s);
        }
    }
}

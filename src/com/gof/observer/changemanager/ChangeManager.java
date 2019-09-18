package com.gof.observer.changemanager;

import com.gof.observer.domain.Observer;
import com.gof.observer.domain.Subject;

public interface ChangeManager {
    void register(Subject s, Observer o);
    void unregister(Subject s, Observer o);
    void notifyObservers(Subject s);
}

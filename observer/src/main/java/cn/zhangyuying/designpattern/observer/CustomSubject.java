package cn.zhangyuying.designpattern.observer;

import java.util.List;

/**
 * @author zyy.
 */
public abstract class CustomSubject {

    protected List<CustomObserver> observerList;

    public void attach(CustomObserver observer) {
        observerList.add(observer);
    }

    public void detach(CustomObserver observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        for (CustomObserver observer : observerList) {
            observer.update();
        }
    }

    public abstract void subjectChange();

}

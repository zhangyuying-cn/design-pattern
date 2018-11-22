package cn.zhangyuying.designpattern.observer.utilimpl;

import java.util.Observable;

/**
 * @author zyy.
 */
public class MsgSubjectImplUtil extends Observable {

    public void subjectChange() {
        setChanged();
        notifyObservers();
    }
}

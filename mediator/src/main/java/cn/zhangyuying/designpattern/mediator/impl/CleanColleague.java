package cn.zhangyuying.designpattern.mediator.impl;

import cn.zhangyuying.designpattern.mediator.Colleague;
import cn.zhangyuying.designpattern.mediator.Mediator;

/**
 * @author zyy.
 */
public class CleanColleague extends Colleague {

    public CleanColleague(Mediator mediator) {
        setMediator(mediator);
    }

    @Override
    public String toString() {
        return "clean";
    }
}

package cn.zhangyuying.designpattern.mediator.impl;

import cn.zhangyuying.designpattern.mediator.Colleague;
import cn.zhangyuying.designpattern.mediator.Mediator;

/**
 * @author zyy.
 */
public class MaintainColleague extends Colleague {

    public MaintainColleague(Mediator mediator) {
        setMediator(mediator);
    }
    @Override
    public String toString() {
        return "maintain";
    }
}

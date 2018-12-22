package cn.zhangyuying.designpattern.mediator.impl;

import cn.zhangyuying.designpattern.mediator.Colleague;
import cn.zhangyuying.designpattern.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyy.
 */
public class MessageMediator implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    public MessageMediator() {
        addColleague(new FinanceColleague(this));
        addColleague(new MaintainColleague(this));
        addColleague(new CleanColleague(this));
    }

    @Override
    public void notice(Colleague colleague, String message) {
        for (Colleague concreteColleague : colleagues) {
            if (!concreteColleague.toString().equals(colleague.toString())) {
                concreteColleague.notice(message);
            }
        }
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
}

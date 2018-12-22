package cn.zhangyuying.designpattern.mediator;

import java.util.List;

/**
 * @author zyy.
 */
public interface Mediator {

    void notice(Colleague colleague, String message);
}

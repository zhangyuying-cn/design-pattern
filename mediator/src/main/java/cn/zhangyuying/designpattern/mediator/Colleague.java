package cn.zhangyuying.designpattern.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zyy.
 */
public abstract class Colleague {

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(Colleague.class);

    private Mediator mediator;

    private Map<String, String> nameMap = new HashMap<>();

    {
        nameMap.put("finance", "财务部门");
        nameMap.put("maintain", "运维部门");
        nameMap.put("clean", "清洁部门");
    }

    public void notice(String message) {
        logger.info(nameMap.get(this.toString()) + "收到：" + message);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    void sendMessage(String message) {
        mediator.notice(this, message);
    }

    @Override
    public abstract String toString();
}

package cn.zhangyuying.designpattern.strategy.strategy;

import cn.zhangyuying.designpattern.strategy.IMsgSendStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class SynchronizeStrategy implements IMsgSendStrategy {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(SynchronizeStrategy.class);

    @Override
    public void sendMethod() {
        logger.info("同步方式发送消息！");
    }
}

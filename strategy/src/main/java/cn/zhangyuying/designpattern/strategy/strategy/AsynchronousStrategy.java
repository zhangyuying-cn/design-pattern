package cn.zhangyuying.designpattern.strategy.strategy;

import cn.zhangyuying.designpattern.strategy.IMsgSendStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class AsynchronousStrategy implements IMsgSendStrategy {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(AsynchronousStrategy.class);

    @Override
    public void sendMethod() {
        logger.info("异步方式发送消息！");
    }
}

package cn.zhangyuying.designpattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class MsgSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MsgSender.class);

    public void sendMessage(String message) {
        logger.error("消息已发送成功: " + message);
    }
}

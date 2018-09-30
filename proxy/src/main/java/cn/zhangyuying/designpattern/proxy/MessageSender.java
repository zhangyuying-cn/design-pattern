package cn.zhangyuying.designpattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class MessageSender implements Message {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MessageSender.class);

    @Override
    public void sendMessage(String content) {
        logger.info("发送消息成功！消息内容为：" + content);
    }
}

package cn.zhangyuying.designpattern.simplefactory.impl;

import cn.zhangyuying.designpattern.simplefactory.IMsgSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class QQSender implements IMsgSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(QQSender.class);

    @Override
    public void sendMessage(String message) {
        logger.info(String.format("发送QQ消息！消息内容：%s", message));
    }
}

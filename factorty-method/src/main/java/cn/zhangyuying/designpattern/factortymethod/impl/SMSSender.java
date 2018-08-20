package cn.zhangyuying.designpattern.factortymethod.impl;

import cn.zhangyuying.designpattern.factortymethod.IMsgSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class SMSSender implements IMsgSender {

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(SMSSender.class);

    @Override
    public void sendMessage(String message) {
        logger.info(String.format("发送短信消息！消息内容：%s", message));
    }
}

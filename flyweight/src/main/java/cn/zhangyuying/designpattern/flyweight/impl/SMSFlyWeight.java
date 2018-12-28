package cn.zhangyuying.designpattern.flyweight.impl;

import cn.zhangyuying.designpattern.flyweight.MsgFlyWeight;
import cn.zhangyuying.designpattern.flyweight.MsgType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class SMSFlyWeight implements MsgFlyWeight {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(SMSFlyWeight.class);

    /**  内部状态 */
    private MsgType msgType;

    public SMSFlyWeight(MsgType msgType) {
        this.msgType = msgType;
    }

    @Override
    public void sendMessage(String message) {
        logger.info(String.format(MESSAGE_OUT_FORMAT, msgType.getDescribe(), message));
    }
}

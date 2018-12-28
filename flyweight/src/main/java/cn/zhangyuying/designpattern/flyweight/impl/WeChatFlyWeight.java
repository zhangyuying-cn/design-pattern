package cn.zhangyuying.designpattern.flyweight.impl;

import cn.zhangyuying.designpattern.flyweight.MsgFlyWeight;
import cn.zhangyuying.designpattern.flyweight.MsgType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class WeChatFlyWeight implements MsgFlyWeight {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(WeChatFlyWeight.class);

    /**  内部状态 */
    private MsgType msgType;

    public WeChatFlyWeight(MsgType msgType) {
        this.msgType = msgType;
    }

    @Override
    public void sendMessage(String message) {
        logger.info(String.format(MESSAGE_OUT_FORMAT, msgType.getDescribe(), message));
    }
}

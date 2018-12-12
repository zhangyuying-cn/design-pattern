package cn.zhangyuying.designpattern.state.impl;

import cn.zhangyuying.designpattern.state.MsgContext;
import cn.zhangyuying.designpattern.state.MsgSendState;
import cn.zhangyuying.designpattern.state.MsgState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class MsgRetryState extends MsgState {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MsgRetryState.class);

    @Override
    public void handle(MsgContext msgContext, MsgSendState msgSendState) {
        if (MsgSendState.RETRY.equals(msgSendState)) {
            logger.info("消息当前的发送状态为重试");
        } else {
            logger.info("当前的状态不是重试，设置状态为失败");
            msgContext.changeState(new MsgFailState(),msgSendState);
        }

    }
}

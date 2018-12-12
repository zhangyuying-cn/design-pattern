package cn.zhangyuying.designpattern.state.impl;

import cn.zhangyuying.designpattern.state.MsgContext;
import cn.zhangyuying.designpattern.state.MsgSendState;
import cn.zhangyuying.designpattern.state.MsgState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class MsgSuccessState extends MsgState {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MsgSuccessState.class);

    @Override
    public void handle(MsgContext msgContext, MsgSendState msgSendState) {
        if (MsgSendState.SUCCESS.equals(msgSendState)) {
            logger.info("消息当前的发送状态为成功");
        } else {
            logger.info("当前的状态不是成功，设置状态为重试");
            msgContext.changeState(new MsgRetryState(),msgSendState);
        }

    }

}

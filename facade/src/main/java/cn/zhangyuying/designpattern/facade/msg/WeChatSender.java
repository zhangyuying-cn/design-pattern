package cn.zhangyuying.designpattern.facade.msg;

import cn.zhangyuying.designpattern.facade.MsgContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author zyy.
 */
public class WeChatSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(WeChatSender.class);

    public void sendText(String text) {
        logger.error(String.format(MsgContants.TEXT_MESSAGE, MsgContants.WECHAT, text));
    }

    public void sendExpression(String expression) {
        logger.error(String.format(MsgContants.EXPRESSION_MESSAGE, MsgContants.WECHAT, expression));
    }
}

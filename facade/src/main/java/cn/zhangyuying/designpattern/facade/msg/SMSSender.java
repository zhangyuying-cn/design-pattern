package cn.zhangyuying.designpattern.facade.msg;

import cn.zhangyuying.designpattern.facade.MsgContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author zyy.
 */
public class SMSSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(SMSSender.class);

    public void sendText(String text) {
        logger.error(String.format(MsgContants.TEXT_MESSAGE, MsgContants.SMS, text));
    }

    public void sendExpression(String expression) {
        logger.error(String.format(MsgContants.EXPRESSION_MESSAGE, MsgContants.SMS, expression));
    }
}

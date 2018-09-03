package cn.zhangyuying.designpattern.facade.msg;

import cn.zhangyuying.designpattern.facade.MsgContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author zyy.
 */
public class QQSender {

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(QQSender.class);

    public void sendText(String text) {
        logger.error(String.format(MsgContants.TEXT_MESSAGE, MsgContants.QQ, text));
    }

    public void sendExpression(String expression) {
        logger.error(String.format(MsgContants.EXPRESSION_MESSAGE, MsgContants.QQ, expression));
    }
}

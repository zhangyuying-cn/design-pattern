package cn.zhangyuying.designpattern.facade;

import cn.zhangyuying.designpattern.facade.msg.QQSender;
import cn.zhangyuying.designpattern.facade.msg.SMSSender;
import cn.zhangyuying.designpattern.facade.msg.WeChatSender;

/**
 * @author zyy.
 */
public class MsgFacade {

    private QQSender qqSender;

    private WeChatSender weChatSender;

    private SMSSender smsSender;

    MsgFacade() {
        qqSender = new QQSender();
        weChatSender = new WeChatSender();
        smsSender = new SMSSender();
    }

    public void sendTextMessage(String text) {
        qqSender.sendText(text);
        weChatSender.sendText(text);
        smsSender.sendText(text);

    }

    public void sendExpressionMessage(String expression) {
        qqSender.sendExpression(expression);
        weChatSender.sendExpression(expression);
        smsSender.sendExpression(expression);
    }

}

package cn.zhangyuying.designpattern.chainofresponsibility.extend;

import cn.zhangyuying.designpattern.chainofresponsibility.ChainContants;
import cn.zhangyuying.designpattern.chainofresponsibility.Message;
import cn.zhangyuying.designpattern.chainofresponsibility.MessageHandler;

/**
 * @author zyy.
 */
public class QQMessageHandler extends MessageHandler {

    @Override
    public void sendMessage(Message message) {
        if (ChainContants.MESSAGE_TYPE_QQ.equals(message.getType())) {
            System.out.println(ChainContants.getFormatResult(message));
        } else {
            System.out.println(ChainContants.getUnHandlerFormat(ChainContants.MESSAGE_TYPE_QQ, message));
            nextSendMessage(message);
        }
    }

}

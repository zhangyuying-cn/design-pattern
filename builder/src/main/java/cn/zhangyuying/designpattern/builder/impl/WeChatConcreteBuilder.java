package cn.zhangyuying.designpattern.builder.impl;

import cn.zhangyuying.designpattern.builder.MessageBody;
import cn.zhangyuying.designpattern.builder.IMsgBuilder;
import cn.zhangyuying.designpattern.builder.tool.MsgContants;
import cn.zhangyuying.designpattern.builder.tool.SendType;

/**
 * @author zyy.
 */
public class WeChatConcreteBuilder implements IMsgBuilder {

    private MessageBody messageBody;

    public WeChatConcreteBuilder(MessageBody messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public void buildSender(String sender) {
        messageBody.setSender(MsgContants.createDescribe(MsgContants.senderFormat, SendType.WECHAT.getDescribe(), sender));
    }

    @Override
    public void buildSendMethod() {
        messageBody.setSendType(MsgContants.createDescribe(MsgContants.senderTypeDescribe, SendType.WECHAT.getDescribe()));
    }

    @Override
    public void buildReceiveMethod(String receiveMethod) {
        messageBody.setReceiveMethod(MsgContants.createDescribe(MsgContants.receiveMethodFormat, "微信：", receiveMethod));
    }

    @Override
    public void buildReceiver(String receiver) {
        messageBody.setReceiver(MsgContants.createDescribe(MsgContants.receiverFormat, SendType.WECHAT.getDescribe(), receiver));
    }

    @Override
    public void buildContext(String context) {
        messageBody.setContext(MsgContants.createDescribe(MsgContants.contextFormat, SendType.WECHAT.getDescribe(), context));
    }

    @Override
    public MessageBody getMessageBody() {
        return messageBody;
    }
}

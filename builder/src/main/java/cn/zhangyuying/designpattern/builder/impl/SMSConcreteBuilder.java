package cn.zhangyuying.designpattern.builder.impl;

import cn.zhangyuying.designpattern.builder.MessageBody;
import cn.zhangyuying.designpattern.builder.IMsgBuilder;
import cn.zhangyuying.designpattern.builder.tool.MsgContants;
import cn.zhangyuying.designpattern.builder.tool.SendType;

/**
 * @author zyy.
 */
public class SMSConcreteBuilder implements IMsgBuilder {
    private MessageBody messageBody;

    public SMSConcreteBuilder(MessageBody messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public void buildSender(String sender) {
        messageBody.setSender(MsgContants.createDescribe(MsgContants.senderFormat, SendType.SMS.getDescribe(), sender));
    }

    @Override
    public void buildSendMethod() {
        messageBody.setSendType(MsgContants.createDescribe(MsgContants.senderTypeDescribe, SendType.SMS.getDescribe()));
    }

    @Override
    public void buildReceiveMethod(String receiveMethod) {
        messageBody.setReceiveMethod(MsgContants.createDescribe(MsgContants.receiveMethodFormat, "手机", receiveMethod));
    }

    @Override
    public void buildReceiver(String receiver) {
        messageBody.setReceiver(MsgContants.createDescribe(MsgContants.receiverFormat, SendType.SMS.getDescribe(), receiver));
    }

    @Override
    public void buildContext(String context) {
        messageBody.setContext(MsgContants.createDescribe(MsgContants.contextFormat, SendType.SMS.getDescribe(), context));
    }

    @Override
    public MessageBody getMessageBody() {
        return messageBody;
    }
}

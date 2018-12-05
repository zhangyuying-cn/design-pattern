package cn.zhangyuying.designpattern.builder.impl;

import cn.zhangyuying.designpattern.builder.MessageBody;
import cn.zhangyuying.designpattern.builder.IMsgBuilder;
import cn.zhangyuying.designpattern.builder.tool.MsgContants;
import cn.zhangyuying.designpattern.builder.tool.SendType;

/**
 * @author zyy.
 */
public class QQConcreteBuilder implements IMsgBuilder {

    private MessageBody messageBody;

    public QQConcreteBuilder(MessageBody messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public void buildSender(String sender) {
        messageBody.setSender(MsgContants.createDescribe(MsgContants.senderFormat, SendType.QQ, sender));
    }

    @Override
    public void buildSendMethod() {
        messageBody.setSendType(MsgContants.createDescribe(MsgContants.senderTypeDescribe,  SendType.QQ));
    }

    @Override
    public void buildReceiveMethod(String receiveMethod) {
        messageBody.setReceiveMethod(MsgContants.createDescribe(MsgContants.receiveMethodFormat, SendType.QQ, receiveMethod));
    }

    @Override
    public void buildReceiver(String receiver) {
        messageBody.setReceiver(MsgContants.createDescribe(MsgContants.receiverFormat, SendType.QQ, receiver));
    }

    @Override
    public void buildContext(String context) {
        messageBody.setContext(MsgContants.createDescribe(MsgContants.contextFormat, SendType.QQ, context));
    }

    @Override
    public MessageBody getMessageBody() {
        return messageBody;
    }
}

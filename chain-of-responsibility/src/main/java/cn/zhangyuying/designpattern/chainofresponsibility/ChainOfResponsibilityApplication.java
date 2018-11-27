package cn.zhangyuying.designpattern.chainofresponsibility;

import cn.zhangyuying.designpattern.chainofresponsibility.extend.QQMessageHandler;
import cn.zhangyuying.designpattern.chainofresponsibility.extend.SMSMessageHandler;
import cn.zhangyuying.designpattern.chainofresponsibility.extend.WeChatMessageHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsibilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainOfResponsibilityApplication.class, args);

        MessageHandler messageChain = new QQMessageHandler();
        MessageHandler weChatMessageHandler = new WeChatMessageHandler();
        MessageHandler smsMessageHandler = new SMSMessageHandler();

        smsMessageHandler.setMessageHandler(messageChain);
        weChatMessageHandler.setMessageHandler(smsMessageHandler);
        messageChain.setMessageHandler(weChatMessageHandler);
        System.out.println("开始发送短信消息---");
        Message smsMessage = buildMessage();
        smsMessage.setType(ChainContants.MESSAGE_TYPE_SMS);
        messageChain.sendMessage(smsMessage);
        System.out.println("开始发送微信消息---");
        Message weChatMessage = buildMessage();
        weChatMessage.setType(ChainContants.MESSAGE_TYPE_WECHAT);
        messageChain.sendMessage(weChatMessage);
        System.out.println("开始发送QQ消息---");
        Message qqMessage = buildMessage();
        qqMessage.setType(ChainContants.MESSAGE_TYPE_QQ);
        messageChain.sendMessage(qqMessage);
    }

    private static Message buildMessage() {
        Message message = new Message();
        message.setContext("这是消息的内容");
        message.setReceiver("接收人");
        message.setSender("发送人");
        return message;
    }
}

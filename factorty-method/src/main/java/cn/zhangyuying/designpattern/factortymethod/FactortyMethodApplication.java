package cn.zhangyuying.designpattern.factortymethod;

import cn.zhangyuying.designpattern.factortymethod.impl.QQSendFactory;
import cn.zhangyuying.designpattern.factortymethod.impl.SMSSendFactory;
import cn.zhangyuying.designpattern.factortymethod.impl.WechatSendFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactortyMethodApplication {
    private final static String messageContent = "发送的消息内容";

    public static void main(String[] args) {
        SpringApplication.run(FactortyMethodApplication.class, args);
        sendSMSMessageTest();
        sendWeChatMessageTest();
        sendQQMessageTest();

    }

    private static void sendSMSMessageTest() {
        IMsgSendFactory msgSendFactory = new SMSSendFactory();
        IMsgSender msgSender = msgSendFactory.createMsgSender();
        msgSender.sendMessage(messageContent);
    }

    private static void sendWeChatMessageTest() {
        IMsgSendFactory msgSendFactory = new WechatSendFactory();
        IMsgSender msgSender = msgSendFactory.createMsgSender();
        msgSender.sendMessage(messageContent);
    }

    private static void sendQQMessageTest() {
        IMsgSendFactory msgSendFactory = new QQSendFactory();
        IMsgSender msgSender = msgSendFactory.createMsgSender();
        msgSender.sendMessage(messageContent);
    }
}

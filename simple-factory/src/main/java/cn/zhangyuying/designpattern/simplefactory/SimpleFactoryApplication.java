package cn.zhangyuying.designpattern.simplefactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zyy
 */
@SpringBootApplication
public class SimpleFactoryApplication {
    private final static String messageContent = "发送的消息内容";

    public static void main(String[] args) {
        SpringApplication.run(SimpleFactoryApplication.class, args);
        sendSMSMessageTest();
        sendWeChatMessageTest();
        sendQQMessageTest();

    }

    private static void sendSMSMessageTest() {
        IMsgSender msgSender = MessageSendFactory.getSender(SendType.SMS);
        msgSender.sendMessage(messageContent);
    }

    private static void sendWeChatMessageTest() {
        IMsgSender msgSender = MessageSendFactory.getSender(SendType.WECHAT);
        msgSender.sendMessage(messageContent);
    }

    private static void sendQQMessageTest() {
        IMsgSender msgSender = MessageSendFactory.getSender(SendType.QQ);
        msgSender.sendMessage(messageContent);
    }
}

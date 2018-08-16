package cn.zhangyuying.designpattern.simplefactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zyy
 */
@SpringBootApplication
public class SimpleFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleFactoryApplication.class, args);
        sendSMSMessageTest();
        sendWeChatMessageTest();
        sendQQMessageTest();

    }

    private static void sendSMSMessageTest() {
        String smsMessage = "测试发送短信消息";
        IMsgSender msgSender = MessageSendFactory.getSender(SendType.SMS);
        msgSender.sendMessage(smsMessage);
    }

    private static void sendWeChatMessageTest() {
        String weChatMessage = "测试发送微信消息";
        IMsgSender msgSender = MessageSendFactory.getSender(SendType.WECHAT);
        msgSender.sendMessage(weChatMessage);
    }

    private static void sendQQMessageTest() {
        String qqMessage = "测试发送qq消息";
        IMsgSender msgSender = MessageSendFactory.getSender(SendType.QQ);
        msgSender.sendMessage(qqMessage);
    }
}

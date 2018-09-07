package cn.zhangyuying.designpattern.templatemethod;

import cn.zhangyuying.designpattern.templatemethod.message.QQSender;
import cn.zhangyuying.designpattern.templatemethod.message.SMSSender;
import cn.zhangyuying.designpattern.templatemethod.message.WeChatSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateMethodApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateMethodApplication.class, args);
        sendQQMessage();
        sendSMSMessage();
        sendWeChatMessage();
    }

    private static void sendQQMessage() {
        String message = "QQ:12345;这是QQ消息内容！";
        MsgTemplate msgTemplate = new QQSender();
        msgTemplate.sendMessage(message);
    }

    private static void sendSMSMessage() {
        String message = "phone:12345;这是短信消息内容！";
        MsgTemplate msgTemplate = new SMSSender();
        msgTemplate.sendMessage(message);
    }

    private static void sendWeChatMessage() {
        String message = "wechat:12345;这是微信消息内容！";
        MsgTemplate msgTemplate = new WeChatSender();
        msgTemplate.sendMessage(message);
    }
}

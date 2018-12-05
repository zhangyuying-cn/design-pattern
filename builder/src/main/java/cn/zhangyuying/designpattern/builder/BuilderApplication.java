package cn.zhangyuying.designpattern.builder;

import cn.zhangyuying.designpattern.builder.impl.QQConcreteBuilder;
import cn.zhangyuying.designpattern.builder.impl.SMSConcreteBuilder;
import cn.zhangyuying.designpattern.builder.impl.WeChatConcreteBuilder;
import cn.zhangyuying.designpattern.builder.tool.SendType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderApplication.class, args);
        buildQQMessage();
        buildWechatMessage();
        buildSMSMessage();
        //内部类实现的建造者
        builderMessageByInnerClass();
    }

    private static void builderMessageByInnerClass() {
        MessageBody messageBody = new MessageBody.Builder(SendType.QQ.getDescribe(), "张三", "李四请接收", "李四", "123456").withExt("这个消息是测试的")
                .buildMessageBody();
        System.out.println(messageBody);
    }

    private static void buildSMSMessage() {
        SMSConcreteBuilder smsBuilder = new SMSConcreteBuilder(new MessageBody());
        MessageBody messageBody = MsgDirector.director(smsBuilder, "张三", "李四", "12345678", "发送短信消息的消息内容");
        System.out.println(messageBody.toString());
    }

    private static void buildWechatMessage() {
        WeChatConcreteBuilder weChatBuilder = new WeChatConcreteBuilder(new MessageBody());
        MessageBody messageBody = MsgDirector.director(weChatBuilder, "张三", "李四", "12345678", "发送微信消息的消息内容");
        System.out.println(messageBody.toString());
    }

    private static void buildQQMessage() {
        QQConcreteBuilder qqBuilder = new QQConcreteBuilder(new MessageBody());
        MessageBody messageBody = MsgDirector.director(qqBuilder, "张三", "李四", "12345678", "发送QQ消息的消息内容");
        System.out.println(messageBody.toString());
    }
}

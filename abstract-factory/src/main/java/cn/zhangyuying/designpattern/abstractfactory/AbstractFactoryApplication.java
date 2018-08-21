package cn.zhangyuying.designpattern.abstractfactory;

import cn.zhangyuying.designpattern.abstractfactory.impl.CustomizedPlatformFactory;
import cn.zhangyuying.designpattern.abstractfactory.impl.UnifiedPlatformFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 抽象工厂模式，
 * 场景：发送qq、微信、短信消息，
 * 有一些地区选择使用统一的消息平台（Unified message platform）发送三种消息，
 * 有一些地区选择定制化的消息平台 （Customized message platform） 发送三种消息
 * @author zyy
 */
@SpringBootApplication
public class AbstractFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryApplication.class, args);
        //1.使用统一消息平台发消息
        testUnifiedPlatform();
        //2.使用定制化消息平台发消息
        testCustomizedPlatform();
    }

    public static void testUnifiedPlatform() {
        IMsgPlatformFactory msgPlatformFactory = new UnifiedPlatformFactory();
        msgPlatformFactory.createQQSender().sendQQMessage();
        msgPlatformFactory.createSMSSender().sendSMSMessage();
        msgPlatformFactory.createWeChatSender().sendWeChatMessage();
    }

    public static void testCustomizedPlatform() {
        IMsgPlatformFactory msgPlatformFactory = new CustomizedPlatformFactory();
        msgPlatformFactory.createQQSender().sendQQMessage();
        msgPlatformFactory.createSMSSender().sendSMSMessage();
        msgPlatformFactory.createWeChatSender().sendWeChatMessage();
    }
}

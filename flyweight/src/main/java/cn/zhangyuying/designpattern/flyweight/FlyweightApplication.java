package cn.zhangyuying.designpattern.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyweightApplication {
    
    private static final String MESSAGE_CONTEXT_FIRST = "您有未读消息，请查收！";

    private static final String MESSAGE_CONTEXT_SECOND = "您有未读消息即将过时，请及时查收！";

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(FlyweightApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FlyweightApplication.class, args);
        MsgFlyWeightFactory msgFlyWeightFactory = new MsgFlyWeightFactory();
        sendQQMessage(msgFlyWeightFactory, MESSAGE_CONTEXT_FIRST);
        sendWeChatMessage(msgFlyWeightFactory, MESSAGE_CONTEXT_FIRST);
        sendSMSMessage(msgFlyWeightFactory, MESSAGE_CONTEXT_FIRST);
        sendQQMessage(msgFlyWeightFactory, MESSAGE_CONTEXT_FIRST);
        sendWeChatMessage(msgFlyWeightFactory, MESSAGE_CONTEXT_FIRST);
        sendSMSMessage(msgFlyWeightFactory, MESSAGE_CONTEXT_FIRST);
        sendQQMessage(msgFlyWeightFactory, MESSAGE_CONTEXT_SECOND);
        sendWeChatMessage(msgFlyWeightFactory, MESSAGE_CONTEXT_SECOND);
        sendSMSMessage(msgFlyWeightFactory, MESSAGE_CONTEXT_SECOND);
        logger.info("当前客户端数量：" + msgFlyWeightFactory.getAllFlyWeightSize());
    }

    private static void sendSMSMessage(MsgFlyWeightFactory msgFlyWeightFactory, String message) {
        MsgFlyWeight msgFlyWeight = msgFlyWeightFactory.getMsgClient(MsgType.SMS);
        msgFlyWeight.sendMessage(message);
    }

    private static void sendWeChatMessage(MsgFlyWeightFactory msgFlyWeightFactory, String message) {
        MsgFlyWeight msgFlyWeight = msgFlyWeightFactory.getMsgClient(MsgType.WECHAT);
        msgFlyWeight.sendMessage(message);
    }

    private static void sendQQMessage(MsgFlyWeightFactory msgFlyWeightFactory, String message) {
        MsgFlyWeight msgFlyWeight = msgFlyWeightFactory.getMsgClient(MsgType.QQ);
        msgFlyWeight.sendMessage(message);
    }

}


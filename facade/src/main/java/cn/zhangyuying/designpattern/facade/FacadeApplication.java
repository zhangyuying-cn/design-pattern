package cn.zhangyuying.designpattern.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 场景为：要同时发送qq、微信、短信消息，通过外观模式不与每个种类的消息单独接触
 * @author zyy
 */
@SpringBootApplication
public class FacadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacadeApplication.class, args);
        sendMessage();
    }

    public static void sendMessage() {
        MsgFacade msgFacade = new MsgFacade();
        String textMsg = "这是一段文字消息";
        String expressionMsg = "开心";
        msgFacade.sendTextMessage(textMsg);
        msgFacade.sendExpressionMessage(expressionMsg);
    }
}

package cn.zhangyuying.designpattern.bridge;

import cn.zhangyuying.designpattern.bridge.impl.AsyncMethod;
import cn.zhangyuying.designpattern.bridge.impl.SendQQMessage;
import cn.zhangyuying.designpattern.bridge.impl.SendSMSMessage;
import cn.zhangyuying.designpattern.bridge.impl.SendWeChatMessage;
import cn.zhangyuying.designpattern.bridge.impl.SyncMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zyy
 */
@SpringBootApplication
public class BridgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgeApplication.class, args);
        sendSMSMessage();
        sendQQMessage();
        sendWechatMessage();

    }

    private static void sendWechatMessage() {
        SendMessage sendMessage = new SendWeChatMessage(new SyncMethod());
        sendMessage.sendMessage("微信提醒：请及时签收");
        sendMessage.changeSendMethod(new AsyncMethod());
        sendMessage.sendMessage("微信提醒：请及时签收");
    }

    private static void sendSMSMessage() {
        SendMessage sendMessage = new SendSMSMessage(new SyncMethod());
        sendMessage.sendMessage("短信提醒：请及时签收");
        sendMessage.changeSendMethod(new AsyncMethod());
        sendMessage.sendMessage("短信提醒：请及时签收");
    }

    private static void sendQQMessage() {
        SendMessage sendMessage = new SendQQMessage(new SyncMethod());
        sendMessage.sendMessage("QQ提醒：请及时签收");
        sendMessage.changeSendMethod(new AsyncMethod());
        sendMessage.sendMessage("QQ提醒：请及时签收");
    }

}


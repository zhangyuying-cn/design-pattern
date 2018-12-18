package cn.zhangyuying.designpattern.bridge.impl;

import cn.zhangyuying.designpattern.bridge.SendMessage;
import cn.zhangyuying.designpattern.bridge.SendMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class SendSMSMessage extends SendMessage {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(SendSMSMessage.class);

    public SendSMSMessage(SendMethod sendMethod) {
        this.sendMethod = sendMethod;
    }

    @Override
    public void sendMessage(String message) {
        String client = "短信 client";
        String result = sendMethod.getSendMsgResultByMethod(client);
        logger.info("发送消息成功：" + result + "；消息内容：" + message);
    }
}

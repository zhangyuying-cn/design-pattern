package cn.zhangyuying.designpattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author zyy.
 */
public class MessageSenderProxy implements Message {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MessageSenderProxy.class);

    private MessageSender messageSender;

    private Date LAST_TIME;

    MessageSenderProxy() {
        this.messageSender = new MessageSender();
    }

    @Override
    public void sendMessage(String content) {
        if (LAST_TIME == null) {
            LAST_TIME = new Date();
            messageSender.sendMessage(content);
            return;
        }
        Date currentTime = new Date();
        currentTime.setTime(currentTime.getTime() - 60 * 1000);
        if (LAST_TIME.after(currentTime)) {
            logger.info("1分钟内不可重复发送消息！");
            return;
        }
        messageSender.sendMessage(content);
        LAST_TIME = new Date();
    }
}

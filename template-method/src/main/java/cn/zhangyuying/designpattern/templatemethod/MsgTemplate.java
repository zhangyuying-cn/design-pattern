package cn.zhangyuying.designpattern.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 * 发送消息的模板：
 * 1.校验参数是否正确
 * 2.消息存入到本地数据库
 * 3.发送消息
 */
public abstract class MsgTemplate {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MsgTemplate.class);

    public void sendMessage(String message) {
        checkMessage(message);
        save2DB(message);
        send();
    }

    protected abstract void checkMessage(String meaage);

    private void save2DB(String message) {
        logger.error("save message to DB! message:" + message);
    }

    protected abstract void send();

}

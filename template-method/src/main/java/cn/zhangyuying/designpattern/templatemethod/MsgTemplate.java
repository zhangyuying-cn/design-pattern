package cn.zhangyuying.designpattern.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 * 发送消息的模板：
 * 1.校验参数是否正确
 * 2.消息存入到本地数据库
 * 3.发送消息
 * 4.回执：是否成功（钩子，是否需要回执由子类选择）
 */
public abstract class MsgTemplate {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MsgTemplate.class);

    public void sendMessage(String message) {
        checkMessage(message);
        save2DB(message);
        send();
        if (needFeedback()) {
            feedback();
        }
    }

    protected abstract void checkMessage(String meaage);

    private void save2DB(String message) {
        logger.error("save message to DB! message:" + message);
    }

    protected abstract void send();

    protected boolean needFeedback() {
        return false;
    }

    private void feedback() {
        logger.error("message status!");
    }

}

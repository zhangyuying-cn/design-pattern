package cn.zhangyuying.designpattern.memento.whitebox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class MessageOriginator {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MessageOriginator.class);

    private String context;

    private String state;

    private String receiver;

    public MessageOriginator(String context, String state, String receiver) {
        this.context = context;
        this.state = state;
        this.receiver = receiver;
    }

    public MessageMemento saveMemento() {
        return new MessageMemento(state);
    }

    public void resetMsgState(MessageMemento msgMemento) {
        this.state = msgMemento.getState();
    }

    public boolean sendMessage() {
        if (receiver == null) {
            logger.info("接收人为空，不可发送消息");
            setState("发送失败");
            return false;
        }
        logger.info("发送消息成功，接收人为：" + receiver + "消息内容为：" + context);
        setState("发送成功");
        return true;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}

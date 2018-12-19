package cn.zhangyuying.designpattern.memento.whitebox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
class MessageMemento {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MessageMemento.class);

    private String state;

    MessageMemento(String state) {
        this.state = state;
        logger.info("白箱备忘录保存当前状态：" + state);
    }

    String getState() {
        return state;
    }

    void setState(String state) {
        this.state = state;
    }
}

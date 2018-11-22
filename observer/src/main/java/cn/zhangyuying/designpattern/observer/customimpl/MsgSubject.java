package cn.zhangyuying.designpattern.observer.customimpl;

import cn.zhangyuying.designpattern.observer.CustomSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * @author zyy.
 */
public class MsgSubject extends CustomSubject {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MsgSubject.class);

    public MsgSubject() {
        observerList = new ArrayList<>();
    }

    @Override
    public void subjectChange() {
        logger.info("消息已成功发送，可修改状态");
        notifyObserver();

    }
}

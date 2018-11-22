package cn.zhangyuying.designpattern.observer.utilimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zyy.
 */
public class SMSObserver implements Observer {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(SMSObserver.class);
    private MsgSubjectImplUtil msgSubjectImplUtil;

    public SMSObserver(MsgSubjectImplUtil msgSubjectImplUtil){
        this.msgSubjectImplUtil=msgSubjectImplUtil;
        this.msgSubjectImplUtil.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        logger.info("短信状态更新");

    }
}

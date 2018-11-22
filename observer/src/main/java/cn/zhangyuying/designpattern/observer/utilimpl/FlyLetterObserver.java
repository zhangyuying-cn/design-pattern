package cn.zhangyuying.designpattern.observer.utilimpl;

import cn.zhangyuying.designpattern.observer.customimpl.MsgSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zyy.
 */
public class FlyLetterObserver implements Observer {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(FlyLetterObserver.class);

    private MsgSubjectImplUtil msgSubjectImplUtil;

    public FlyLetterObserver(MsgSubjectImplUtil msgSubjectImplUtil){
        this.msgSubjectImplUtil=msgSubjectImplUtil;
        this.msgSubjectImplUtil.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        logger.info("飞信状态更新");
    }

}

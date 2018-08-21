package cn.zhangyuying.designpattern.abstractfactory.impl.customized;

import cn.zhangyuying.designpattern.abstractfactory.ISMSSender;
import cn.zhangyuying.designpattern.abstractfactory.MsgContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class CustomizedSMSSender implements ISMSSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(CustomizedSMSSender.class);

    @Override
    public void sendSMSMessage() {
        logger.error(MsgContants.CUSTOMIZED_MESSAGE.replace(MsgContants.TYPE, MsgContants.SMS));
    }
}

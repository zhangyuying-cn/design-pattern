package cn.zhangyuying.designpattern.abstractfactory.impl.unified;

import cn.zhangyuying.designpattern.abstractfactory.ISMSSender;
import cn.zhangyuying.designpattern.abstractfactory.MsgContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class UnifiedSMSSender implements ISMSSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(UnifiedSMSSender.class);

    @Override
    public void sendSMSMessage() {
        logger.error(MsgContants.UNIFIED_MESSAGE.replace(MsgContants.TYPE, MsgContants.SMS));
    }
}

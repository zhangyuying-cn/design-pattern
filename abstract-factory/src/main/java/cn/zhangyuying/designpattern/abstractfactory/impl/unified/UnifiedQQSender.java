package cn.zhangyuying.designpattern.abstractfactory.impl.unified;

import cn.zhangyuying.designpattern.abstractfactory.IQQSender;
import cn.zhangyuying.designpattern.abstractfactory.MsgContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class UnifiedQQSender implements IQQSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(UnifiedQQSender.class);

    @Override
    public void sendQQMessage() {
        logger.error(MsgContants.UNIFIED_MESSAGE.replace(MsgContants.TYPE,MsgContants.QQ));
    }
}

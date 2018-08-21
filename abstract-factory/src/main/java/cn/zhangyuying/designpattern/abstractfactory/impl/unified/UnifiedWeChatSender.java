package cn.zhangyuying.designpattern.abstractfactory.impl.unified;

import cn.zhangyuying.designpattern.abstractfactory.IWeChatSender;
import cn.zhangyuying.designpattern.abstractfactory.MsgContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class UnifiedWeChatSender implements IWeChatSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(UnifiedWeChatSender.class);

    @Override
    public void sendWeChatMessage() {
        logger.error(MsgContants.UNIFIED_MESSAGE.replace(MsgContants.TYPE, MsgContants.WECHAT));
    }
}

package cn.zhangyuying.designpattern.abstractfactory.impl.customized;

import cn.zhangyuying.designpattern.abstractfactory.IWeChatSender;
import cn.zhangyuying.designpattern.abstractfactory.MsgContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class CustomizedWeChatSender implements IWeChatSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(CustomizedWeChatSender.class);

    @Override
    public void sendWeChatMessage() {
        logger.error(MsgContants.CUSTOMIZED_MESSAGE.replace(MsgContants.TYPE, MsgContants.WECHAT));
    }
}

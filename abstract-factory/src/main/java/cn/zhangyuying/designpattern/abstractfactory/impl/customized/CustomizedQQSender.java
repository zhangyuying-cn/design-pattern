package cn.zhangyuying.designpattern.abstractfactory.impl.customized;

import cn.zhangyuying.designpattern.abstractfactory.IQQSender;
import cn.zhangyuying.designpattern.abstractfactory.MsgContants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class CustomizedQQSender implements IQQSender {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(CustomizedQQSender.class);


    @Override
    public void sendQQMessage() {
        logger.error(MsgContants.CUSTOMIZED_MESSAGE.replace(MsgContants.TYPE,MsgContants.QQ));
    }
}

package cn.zhangyuying.designpattern.templatemethod.message;

import cn.zhangyuying.designpattern.templatemethod.MsgTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class QQSender extends MsgTemplate {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(QQSender.class);

    private static String QQ = "QQ:";

    @Override
    protected void checkMessage(String meaage) {
        if (!meaage.contains(QQ)) {
            throw new IllegalArgumentException();

        }
        logger.error("校验QQ消息通过！");
    }

    @Override
    protected void send() {
        getQQClient();
        logger.error("发送QQ消息成功");
    }

    private void getQQClient() {
        logger.error("获取到QQ消息客户端！");
    }
}

package cn.zhangyuying.designpattern.templatemethod.message;

import cn.zhangyuying.designpattern.templatemethod.MsgTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class SMSSender extends MsgTemplate {

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(SMSSender.class);

    private static String PHONE = "phone:";

    @Override
    protected void checkMessage(String meaage) {
        if (!meaage.contains(PHONE)) {
            throw new IllegalArgumentException();

        }
        logger.error("校验短信消息通过！");
    }

    @Override
    protected void send() {
        getSMSClient();
        logger.error("发送短信消息成功");
    }

    /**
     * @return 回执
     */
    @Override
    protected boolean needFeedback() {
        return true;
    }

    private void getSMSClient() {
        logger.error("获取到短信消息客户端！");
    }
}

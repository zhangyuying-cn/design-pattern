package cn.zhangyuying.designpattern.templatemethod.message;

import cn.zhangyuying.designpattern.templatemethod.MsgTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class WeChatSender extends MsgTemplate {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(WeChatSender.class);

    private static String WECHAT = "wechat:";

    @Override
    protected void checkMessage(String meaage) {
        if (!meaage.contains(WECHAT)) {
            throw new IllegalArgumentException();

        }
        logger.error("校验微信消息通过！");
    }

    @Override
    protected void send() {
        getWeChatClient();
        logger.error("发送微信消息成功");
    }

    private void getWeChatClient() {
        logger.error("获取到微信消息客户端！");
    }
}

package cn.zhangyuying.designpattern.observer.customimpl;

import cn.zhangyuying.designpattern.observer.CustomObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class WeChatObserver implements CustomObserver {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(WeChatObserver.class);

    @Override
    public void update() {
        logger.info("微信消息状态已更新");
    }
}

package cn.zhangyuying.designpattern.observer.customimpl;

import cn.zhangyuying.designpattern.observer.CustomObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class QQObserver implements CustomObserver {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(QQObserver.class);

    @Override
    public void update() {
        logger.info("QQ状态已更新");
    }
}

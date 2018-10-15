package cn.zhangyuying.designpattern.command.impl;

import cn.zhangyuying.designpattern.command.Receiver;
import cn.zhangyuying.designpattern.command.bean.TV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class TVReceiver implements Receiver {

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(TVReceiver.class);

    private static int MAX_CHANNEL = 100;

    private TV tv;

    public TVReceiver() {
        tv = TV.instance();
    }

    @Override
    public void on() {
        tv.setOn(true);
        logger.info("打开电视机");
    }

    @Override
    public void close() {
        tv.setOn(false);
        logger.info("关闭电视机");
    }

    @Override
    public void next() {
        if (!tv.isOn()) {
            logger.info("当前电视未打开！不能进行操作！");
        }
        tv.setHistory(tv.getCurrent());
        if (tv.getCurrent() == MAX_CHANNEL) {
            logger.info("当前已是最大频道");
            return;
        }
        tv.setCurrent(tv.getCurrent() + 1);
        logger.info("进入下一个频道");
    }

    @Override
    public void previous() {
        if (!tv.isOn()) {
            logger.info("当前电视未打开！不能进行操作！");
        }
        tv.setHistory(tv.getCurrent());
        if (tv.getCurrent() == 0) {
            tv.setCurrent(MAX_CHANNEL);
            return;
        }
        tv.setCurrent(tv.getCurrent() - 1);
        logger.info("回到前一个频道");
    }

    @Override
    public void regresses() {
        if (!tv.isOn()) {
            logger.info("当前电视未打开！不能进行操作！");
        }
        int current = tv.getCurrent();
        tv.setCurrent(tv.getHistory());
        tv.setHistory(current);
        logger.info("回到前一步");
    }

    @Override
    public String toString() {
        return "当前电视的状态为：" + (tv.isOn() ? "开启。" : "关闭。") + "\t" + "当前频道为：" + tv.getCurrent();
    }
}

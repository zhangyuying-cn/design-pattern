package cn.zhangyuying.designpattern.visitor.impl;

import cn.zhangyuying.designpattern.visitor.IMessageVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class ThemeVisitor implements IMessageVisitor {
    private static final String MESSAGE_FORMAT = "设置%s，主题为：%s";

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(ThemeVisitor.class);

    @Override
    public void visitQQClient(QQElement qqElement) {
        qqElement.setTheme("QQ独家活动");
        String qqTheme = String.format(MESSAGE_FORMAT, qqElement.getName(), qqElement.getTheme());
        logger.info(qqTheme);
    }

    @Override
    public void visitWeChatClient(WeChatElement weChatElement) {
        weChatElement.setTheme("微信独家活动");
        String weChatTheme = String.format(MESSAGE_FORMAT, weChatElement.getName(), weChatElement.getTheme());
        logger.info(weChatTheme);
    }

    @Override
    public void visitSMSClient(SMSElement smsElement) {
        smsElement.setTheme("短信独家活动");
        String smsTheme = String.format(MESSAGE_FORMAT, smsElement.getName(), smsElement.getTheme());
        logger.info(smsTheme);
    }
}

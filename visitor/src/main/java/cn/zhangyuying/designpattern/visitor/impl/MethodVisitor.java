package cn.zhangyuying.designpattern.visitor.impl;

import cn.zhangyuying.designpattern.visitor.IMessageVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class MethodVisitor implements IMessageVisitor {

    private static final String MESSAGE_FORMAT = "设置%s，采用的发送方式为：%s";

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MethodVisitor.class);

    @Override
    public void visitQQClient(QQElement qqElement) {
        qqElement.setMethod("异步发送，启用重试机制");
        String qqMethod = String.format(MESSAGE_FORMAT, qqElement.getName(), qqElement.getMethod());
        logger.info(qqMethod);
    }

    @Override
    public void visitWeChatClient(WeChatElement weChatElement) {
        weChatElement.setMethod("异步发送，启用重试机制");
        String weChatMethod = String.format(MESSAGE_FORMAT, weChatElement.getName(), weChatElement.getMethod());
        logger.info(weChatMethod);
    }

    @Override
    public void visitSMSClient(SMSElement smsElement) {
        smsElement.setMethod("同步发送");
        String smsMethod = String.format(MESSAGE_FORMAT, smsElement.getName(), smsElement.getMethod());
        logger.info(smsMethod);
    }
}

package cn.zhangyuying.designpattern.visitor;

import cn.zhangyuying.designpattern.visitor.impl.QQElement;
import cn.zhangyuying.designpattern.visitor.impl.SMSElement;
import cn.zhangyuying.designpattern.visitor.impl.WeChatElement;

/**
 * @author zyy.
 */
public interface IMessageVisitor {
    void visitQQClient(QQElement qqElement);

    void visitWeChatClient(WeChatElement weChatElement);

    void visitSMSClient(SMSElement smsElement);
}

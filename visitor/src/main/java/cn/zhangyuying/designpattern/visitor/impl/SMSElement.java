package cn.zhangyuying.designpattern.visitor.impl;

import cn.zhangyuying.designpattern.visitor.IMessageVisitor;
import cn.zhangyuying.designpattern.visitor.MessageElement;

/**
 * @author zyy.
 */
public class SMSElement extends MessageElement {

    public SMSElement() {
        setName("短信消息");
    }

    public void accept(IMessageVisitor messageVisitor) {
        messageVisitor.visitSMSClient(this);
    }
}
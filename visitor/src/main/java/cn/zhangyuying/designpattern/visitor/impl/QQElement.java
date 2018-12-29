package cn.zhangyuying.designpattern.visitor.impl;

import cn.zhangyuying.designpattern.visitor.IMessageVisitor;
import cn.zhangyuying.designpattern.visitor.MessageElement;

/**
 * @author zyy.
 */
public class QQElement extends MessageElement {

    public QQElement() {
        setName("QQ消息");
    }

    public void accept(IMessageVisitor messageVisitor) {
        messageVisitor.visitQQClient(this);
    }
}

package cn.zhangyuying.designpattern.visitor.impl;

import cn.zhangyuying.designpattern.visitor.IMessageVisitor;
import cn.zhangyuying.designpattern.visitor.MessageElement;

/**
 * @author zyy.
 */
public class WeChatElement extends MessageElement {

    public WeChatElement() {
        setName("微信消息");
    }

    public void accept(IMessageVisitor messageVisitor) {
        messageVisitor.visitWeChatClient(this);
    }
}

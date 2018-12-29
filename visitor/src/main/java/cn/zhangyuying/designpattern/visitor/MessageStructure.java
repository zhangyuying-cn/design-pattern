package cn.zhangyuying.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyy.
 */
public class MessageStructure {
    private List<MessageElement> messageElements;

    public MessageStructure() {
        this.messageElements = new ArrayList<>();
    }

    public void addMessageElement(MessageElement messageElement) {
        messageElements.add(messageElement);
    }

    public void setMessageProperties(IMessageVisitor messageVisitor) {
        for (MessageElement messageElement : messageElements) {
            messageElement.accept(messageVisitor);
        }
    }
}

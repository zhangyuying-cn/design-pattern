package cn.zhangyuying.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyy.
 */
class MessageStructure {
    private List<MessageElement> messageElements;

    MessageStructure() {
        this.messageElements = new ArrayList<>();
    }

    void addMessageElement(MessageElement messageElement) {
        messageElements.add(messageElement);
    }

    void setMessageProperties(IMessageVisitor messageVisitor) {
        for (MessageElement messageElement : messageElements) {
            messageElement.accept(messageVisitor);
        }
    }
}

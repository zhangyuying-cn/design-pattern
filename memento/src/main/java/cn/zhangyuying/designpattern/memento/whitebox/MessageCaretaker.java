package cn.zhangyuying.designpattern.memento.whitebox;

/**
 * @author zyy.
 */
public class MessageCaretaker {
    private MessageMemento msgMemento;

    public MessageMemento getMsgMemento() {
        return msgMemento;
    }

    public void setMsgMemento(MessageMemento msgMemento) {
        this.msgMemento = msgMemento;
    }
}

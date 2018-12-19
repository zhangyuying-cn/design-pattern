package cn.zhangyuying.designpattern.memento.blackbox;

/**
 * @author zyy.
 */
public class MsgCaretaker {

    Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

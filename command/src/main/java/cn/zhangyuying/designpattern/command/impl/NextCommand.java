package cn.zhangyuying.designpattern.command.impl;

import cn.zhangyuying.designpattern.command.Command;
import cn.zhangyuying.designpattern.command.Receiver;

/**
 * @author zyy.
 */
public class NextCommand implements Command {
    private Receiver receiver;

    public NextCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.next();
    }

    @Override
    public void undo() {
        if (receiver != null) {
            receiver.previous();
        }
    }

    @Override
    public void redo() {
        if (receiver != null) {
            receiver.next();
        }
    }
}

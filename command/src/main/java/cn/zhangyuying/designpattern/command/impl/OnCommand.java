package cn.zhangyuying.designpattern.command.impl;

import cn.zhangyuying.designpattern.command.Command;
import cn.zhangyuying.designpattern.command.Receiver;

/**
 * @author zyy.
 */
public class OnCommand implements Command {
    private Receiver receiver;

    public OnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        if (receiver != null) {
            receiver.close();
        }
    }

    @Override
    public void redo() {
        if (receiver != null) {
            receiver.on();
        }
    }
}

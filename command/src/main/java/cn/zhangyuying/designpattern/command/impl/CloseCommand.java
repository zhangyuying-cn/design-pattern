package cn.zhangyuying.designpattern.command.impl;

import cn.zhangyuying.designpattern.command.Command;
import cn.zhangyuying.designpattern.command.Receiver;

/**
 * @author zyy.
 */
public class CloseCommand implements Command {
    private Receiver receiver;

    public CloseCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.close();
    }

    @Override
    public void undo() {
        if (receiver != null) {
            receiver.on();
        }
    }

    @Override
    public void redo() {
        if (receiver != null) {
            receiver.close();
        }
    }
}

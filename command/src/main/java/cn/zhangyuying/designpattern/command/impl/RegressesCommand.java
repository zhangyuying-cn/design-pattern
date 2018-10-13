package cn.zhangyuying.designpattern.command.impl;

import cn.zhangyuying.designpattern.command.Command;
import cn.zhangyuying.designpattern.command.Receiver;

/**
 * @author zyy.
 */
public class RegressesCommand implements Command {
    private Receiver receiver;

    public RegressesCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.regresses();
    }

    @Override
    public void undo() {
        if (receiver != null) {
            receiver.regresses();
        }

    }

    @Override
    public void redo() {
        if (receiver != null) {
            receiver.regresses();
        }

    }
}

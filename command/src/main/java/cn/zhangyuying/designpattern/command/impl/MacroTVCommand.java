package cn.zhangyuying.designpattern.command.impl;

import cn.zhangyuying.designpattern.command.Command;

import java.util.List;

/**
 * @author zyy.
 */
public class MacroTVCommand implements Command {

    private List<Command> commands;

    public MacroTVCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }

    @Override
    public void redo() {
        for (Command command : commands) {
            command.redo();
        }
    }
}

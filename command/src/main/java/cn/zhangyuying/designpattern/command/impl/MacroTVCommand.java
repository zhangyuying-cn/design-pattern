package cn.zhangyuying.designpattern.command.impl;

import cn.zhangyuying.designpattern.command.Command;
import cn.zhangyuying.designpattern.command.MacroCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyy.
 */
public class MacroTVCommand implements MacroCommand {

    private List<Command> commands = new ArrayList<>();

    @Override
    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void removeCommand(Command command) {
        commands.remove(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

}

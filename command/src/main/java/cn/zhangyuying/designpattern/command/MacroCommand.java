package cn.zhangyuying.designpattern.command;

import java.util.List;

/**
 * @author zyy.
 */
public interface MacroCommand {
    void addCommand(Command command);
    void removeCommand(Command command);
    void execute();
}

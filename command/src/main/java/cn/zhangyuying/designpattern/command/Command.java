package cn.zhangyuying.designpattern.command;

/**
 * @author zyy.
 */
public interface Command {
    void execute();

    void undo();

    void redo();

}

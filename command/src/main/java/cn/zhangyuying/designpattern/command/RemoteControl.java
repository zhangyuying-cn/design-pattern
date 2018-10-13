package cn.zhangyuying.designpattern.command;

import cn.zhangyuying.designpattern.command.impl.CloseCommand;
import cn.zhangyuying.designpattern.command.impl.MacroTVCommand;
import cn.zhangyuying.designpattern.command.impl.NextCommand;
import cn.zhangyuying.designpattern.command.impl.OnCommand;
import cn.zhangyuying.designpattern.command.impl.PreviousCommand;
import cn.zhangyuying.designpattern.command.impl.RegressesCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zyy.
 */
public class RemoteControl {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(RemoteControl.class);

    private Command onCommand;

    private Command closeCommand;

    private Command nextCommand;

    private Command previousCommand;

    private Command regressesCommand;

    private MacroCommand macroCommand;

    public RemoteControl(Receiver receiver) {
        onCommand = new OnCommand(receiver);
        closeCommand = new CloseCommand(receiver);
        nextCommand = new NextCommand(receiver);
        previousCommand = new PreviousCommand(receiver);
        regressesCommand = new RegressesCommand(receiver);
        macroCommand = new MacroTVCommand();
    }

    public void on() {
        onCommand.execute();
        logger.info("打开电视机");
        macroCommand.addCommand(onCommand);
    }

    public void close() {
        closeCommand.execute();
        logger.info("关闭电视机");
        macroCommand.addCommand(closeCommand);
    }

    public void next() {
        nextCommand.execute();
        logger.info("进入下一个频道");
        macroCommand.addCommand(nextCommand);
    }

    public void previous() {
        previousCommand.execute();
        logger.info("返回前一个频道");
        macroCommand.addCommand(previousCommand);
    }

    public void regresses() {
        regressesCommand.execute();
        logger.info("回到上一步");
        macroCommand.addCommand(regressesCommand);
    }

    public void macroExecute(){
        macroCommand.execute();
    }

}

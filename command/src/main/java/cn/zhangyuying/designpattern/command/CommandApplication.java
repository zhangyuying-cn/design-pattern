package cn.zhangyuying.designpattern.command;

import cn.zhangyuying.designpattern.command.bean.TVOperation;
import cn.zhangyuying.designpattern.command.impl.CloseCommand;
import cn.zhangyuying.designpattern.command.impl.MacroTVCommand;
import cn.zhangyuying.designpattern.command.impl.NextCommand;
import cn.zhangyuying.designpattern.command.impl.OnCommand;
import cn.zhangyuying.designpattern.command.impl.PreviousCommand;
import cn.zhangyuying.designpattern.command.impl.RegressesCommand;
import cn.zhangyuying.designpattern.command.impl.TVReceiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class CommandApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(CommandApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class, args);
        //创建 接收者：当前场景为电视机
        Receiver receiver = new TVReceiver();
        //创建具体命令
        Command onCommand = new OnCommand(receiver);
        Command closeCommand = new CloseCommand(receiver);
        Command nextCommand = new NextCommand(receiver);
        Command previousCommand = new PreviousCommand(receiver);
        Command regressesCommand = new RegressesCommand(receiver);

        //创建 请求者：当前场景为遥控器
        RemoteControl remoteControl = new RemoteControl();
        //为请求者设置可执行的命令
        remoteControl.addCommand(TVOperation.ON, onCommand);
        remoteControl.addCommand(TVOperation.NEXT, nextCommand);
        remoteControl.addCommand(TVOperation.PREVIOUS, previousCommand);
        remoteControl.addCommand(TVOperation.REGRESSES, regressesCommand);
        remoteControl.addCommand(TVOperation.CLOSE, closeCommand);
        //对遥控器的命令操作
        remoteControl.commandExecute(TVOperation.ON);
        logger.info(receiver.toString());
        remoteControl.commandExecute(TVOperation.NEXT);
        remoteControl.commandExecute(TVOperation.NEXT);
        remoteControl.commandExecute(TVOperation.PREVIOUS);
        remoteControl.commandExecute(TVOperation.REGRESSES);
        logger.info(receiver.toString());
        remoteControl.commandExecute(TVOperation.CLOSE);
        logger.info(receiver.toString());
        remoteControl.commandExecute(TVOperation.ON);
        logger.info(receiver.toString());
        remoteControl.commandExecute(TVOperation.NEXT);
        logger.info(receiver.toString());
        logger.info("开始执行宏命令！");
        Command macroCommand = new MacroTVCommand(new ArrayList<Command>() {
            {
                add(onCommand);
                add(nextCommand);
                add(nextCommand);
                add(closeCommand);
            }
        });
        remoteControl.addCommand(TVOperation.MACRO, macroCommand);
        remoteControl.commandExecute(TVOperation.MACRO);
        logger.info(receiver.toString());

    }
}

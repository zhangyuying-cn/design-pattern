package cn.zhangyuying.designpattern.command;

import cn.zhangyuying.designpattern.command.impl.TVReceiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(CommandApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class, args);
        //创建 接收者：当前场景为电视机
        Receiver receiver = new TVReceiver();
        //创建 请求者：当前场景为遥控器，本例中的多有具体命令都在RemoteControlz中创建
        RemoteControl remoteControl = new RemoteControl(receiver);
        //对遥控器的命令操作
        remoteControl.on();
        logger.info(receiver.toString());
        remoteControl.next();
        remoteControl.next();
        remoteControl.previous();
        remoteControl.regresses();
        logger.info(receiver.toString());
        remoteControl.close();
        logger.info(receiver.toString());
        remoteControl.on();
        logger.info(receiver.toString());
        remoteControl.next();
        logger.info(receiver.toString());
        logger.info("开始执行宏命令！");
        remoteControl.macroExecute();
        logger.info(receiver.toString());

    }
}

package cn.zhangyuying.designpattern.strategy;

import cn.zhangyuying.designpattern.strategy.strategy.AsynchronousStrategy;
import cn.zhangyuying.designpattern.strategy.strategy.SynchronizeStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(StrategyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class, args);
        MsgSenderContext msgSender = new MsgSenderContext(new AsynchronousStrategy());
        msgSender.sendMessageMethod();
        msgSender.changeSendMethod(new SynchronizeStrategy());
        msgSender.sendMessageMethod();

        //java8
        msgSender.changeSendMethod(() -> {
            logger.info("使用java8的声明式函数发送消息！");
        });
        msgSender.sendMessageMethod();
    }
}

package cn.zhangyuying.designpattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(ProxyApplication.class);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ProxyApplication.class, args);
        sendMessage();

    }

    private static void sendMessage() throws InterruptedException {
        String content = "这是一条消息内容！";
        MessageSenderProxy messageSenderProxy = new MessageSenderProxy();
        messageSenderProxy.sendMessage(content);
        messageSenderProxy.sendMessage(content);
        logger.info("过一分钟后再次发送消息，请等待！");
        Thread.sleep(60001);
        messageSenderProxy.sendMessage(content);
    }

}

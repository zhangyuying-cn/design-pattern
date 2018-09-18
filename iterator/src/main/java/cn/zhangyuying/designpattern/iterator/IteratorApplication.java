package cn.zhangyuying.designpattern.iterator;

import cn.zhangyuying.designpattern.iterator.impl.QQAggregate;
import cn.zhangyuying.designpattern.iterator.impl.WeChatAggregate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IteratorApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(IteratorApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(IteratorApplication.class, args);
        testWeChatIterator();
        //内部类实现迭代器
        testQQIterator();
    }

    private static void testQQIterator() {
        IMsgAggregate qqAggregate = new QQAggregate();
        qqAggregate.addItem("第一条微信消息");
        qqAggregate.addItem("QQ表情消息");
        qqAggregate.addItem("QQ语音消息");
        qqAggregate.addItem("QQ文字消息");

        IMsgIterator msgIterator = qqAggregate.createIterator();
        logger.info(msgIterator.currentItem().toString());
        while (!msgIterator.isDone()) {
            logger.info(msgIterator.currentItem().toString());
            msgIterator.next();
        }
    }

    private static void testWeChatIterator() {
        IMsgAggregate msgAggregate = new WeChatAggregate();
        msgAggregate.addItem("第一条微信消息");
        msgAggregate.addItem("微信表情消息");
        msgAggregate.addItem("微信语音消息");
        msgAggregate.addItem("微信文字消息");

        IMsgIterator msgIterator = msgAggregate.createIterator();
        logger.info(msgIterator.currentItem().toString());
        while (!msgIterator.isDone()) {
            logger.info(msgIterator.currentItem().toString());
            msgIterator.next();
        }
    }
}

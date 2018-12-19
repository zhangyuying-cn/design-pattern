package cn.zhangyuying.designpattern.memento;

import cn.zhangyuying.designpattern.memento.blackbox.MsgCaretaker;
import cn.zhangyuying.designpattern.memento.blackbox.MsgOriginator;
import cn.zhangyuying.designpattern.memento.whitebox.MessageCaretaker;
import cn.zhangyuying.designpattern.memento.whitebox.MessageOriginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MementoApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(MementoApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(MementoApplication.class, args);
        whiteBoxMemento();
        blackBoxMemento();
    }

    private static void blackBoxMemento() {
        MsgOriginator msgOriginator = new MsgOriginator("黑箱消息：请及时签收", "待发送", null);
        MsgCaretaker msgCaretaker = new MsgCaretaker();
        msgCaretaker.setMemento(msgOriginator.saveMemento());
        boolean sendResult = msgOriginator.sendMessage();
        logger.info("消息发送后的消息状态：" + msgOriginator.getState());
        if (!sendResult) {
            msgOriginator.resetMsgState(msgCaretaker.getMemento());
            logger.info("回退后的消息状态：" + msgOriginator.getState());
        }
    }

    private static void whiteBoxMemento() {
        MessageOriginator messageOriginator = new MessageOriginator("白箱消息：请及时签收", "待发送", null);
        MessageCaretaker messageCaretaker = new MessageCaretaker();
        messageCaretaker.setMsgMemento(messageOriginator.saveMemento());
        boolean sendResult = messageOriginator.sendMessage();
        logger.info("消息发送后的消息状态：" + messageOriginator.getState());
        if (!sendResult) {
            messageOriginator.resetMsgState(messageCaretaker.getMsgMemento());
            logger.info("回退后的消息状态：" + messageOriginator.getState());
        }
    }

}


package cn.zhangyuying.designpattern.builder;

/**
 * @author zyy.
 */
public interface IMsgBuilder {

    void buildSender(String sender);

    void buildSendMethod();

    void buildReceiveMethod(String receiveMethod);

    void buildReceiver(String receiver);

    void buildContext(String context);

    MessageBody getMessageBody();

}

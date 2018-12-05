package cn.zhangyuying.designpattern.builder;

/**
 * @author zyy.
 */
public class MsgDirector {

    public static MessageBody director(IMsgBuilder msgBuilder, String sender, String receiver, String receiveMethod, String context) {
        msgBuilder.buildContext(context);
        msgBuilder.buildReceiveMethod(receiveMethod);
        msgBuilder.buildReceiver(receiver);
        msgBuilder.buildSender(sender);
        msgBuilder.buildSendMethod();
        return msgBuilder.getMessageBody();
    }
}

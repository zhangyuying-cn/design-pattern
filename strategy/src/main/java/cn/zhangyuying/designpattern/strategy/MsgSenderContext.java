package cn.zhangyuying.designpattern.strategy;

/**
 * @author zyy.
 */
public class MsgSenderContext {
    private IMsgSendStrategy msgSendStrategy;

    public MsgSenderContext(IMsgSendStrategy msgSendStrategy) {
        this.msgSendStrategy = msgSendStrategy;
    }

    public void changeSendMethod(IMsgSendStrategy msgSendStrategy) {
        this.msgSendStrategy = msgSendStrategy;
    }

    public void sendMessageMethod() {
        msgSendStrategy.sendMethod();
    }
}

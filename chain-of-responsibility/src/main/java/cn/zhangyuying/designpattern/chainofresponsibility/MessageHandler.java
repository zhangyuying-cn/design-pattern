package cn.zhangyuying.designpattern.chainofresponsibility;

/**
 * @author zyy.
 */
public abstract class MessageHandler {

    private MessageHandler messageHandler;

    protected abstract void sendMessage(Message message);

    protected void nextSendMessage(Message message) {
        if (messageHandler != null) {
            messageHandler.sendMessage(message);
        } else {
            throw new RuntimeException("责任链的下一个接受者为空");
        }

    }

    void setMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }
}

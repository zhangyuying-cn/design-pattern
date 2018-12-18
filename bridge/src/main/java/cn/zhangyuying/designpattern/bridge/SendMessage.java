package cn.zhangyuying.designpattern.bridge;

/**
 * @author zyy.
 */
public abstract class SendMessage {

    protected SendMethod sendMethod;

    public abstract void sendMessage(String message);

    public void changeSendMethod(SendMethod sendMethod) {
        this.sendMethod = sendMethod;
    }
}

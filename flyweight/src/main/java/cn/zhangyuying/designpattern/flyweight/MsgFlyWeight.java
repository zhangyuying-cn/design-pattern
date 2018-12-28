package cn.zhangyuying.designpattern.flyweight;

/**
 * @author zyy.
 */
public interface MsgFlyWeight {

    String MESSAGE_OUT_FORMAT = "%s客户端，发送消息：%s";

    /**
     * message 为外部状态
     * @param message 消息内容
     */
    void sendMessage(String message);
}

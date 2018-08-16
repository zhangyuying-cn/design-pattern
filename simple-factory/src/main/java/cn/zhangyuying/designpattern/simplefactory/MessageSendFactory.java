package cn.zhangyuying.designpattern.simplefactory;

import cn.zhangyuying.designpattern.simplefactory.impl.QQSender;
import cn.zhangyuying.designpattern.simplefactory.impl.SMSSender;
import cn.zhangyuying.designpattern.simplefactory.impl.WeChatSender;

/**
 * @author zyy.
 */
public class MessageSendFactory {
    public static IMsgSender getSender(SendType type) {
        IMsgSender msgSender;
        switch (type) {
            case QQ:
                msgSender = new QQSender();
                break;
            case WECHAT:
                msgSender = new WeChatSender();
                break;
            case SMS:
                msgSender = new SMSSender();
                break;
            default:
                throw new IllegalArgumentException("发送的消息类型为空！");
        }
        return msgSender;
    }

}

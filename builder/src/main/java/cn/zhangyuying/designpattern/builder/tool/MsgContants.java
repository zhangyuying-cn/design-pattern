package cn.zhangyuying.designpattern.builder.tool;

/**
 * @author zyy.
 */
public class MsgContants {
    public static final String senderFormat = "%s 发送人：%s";

    public static final String senderTypeDescribe = "发送方式：%s";

    public static final String receiverFormat = "%s接收人：%s";

    public static final String contextFormat = "%s内容：%s";

    public static final String receiveMethodFormat = "%s号：%s";

    public static String createDescribe(String format, String sendType, String param) {
        return String.format(format, sendType, param);
    }

    public static String createDescribe(String format, SendType sendType, String param) {
        return String.format(format, sendType, param);
    }

    public static String createDescribe(String format, SendType sendType) {
        return String.format(format, sendType);
    }

    public static String createDescribe(String format, String sendType) {
        return String.format(format, sendType);
    }
}

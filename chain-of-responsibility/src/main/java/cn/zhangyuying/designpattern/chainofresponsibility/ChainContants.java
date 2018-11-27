package cn.zhangyuying.designpattern.chainofresponsibility;

/**
 * @author zyy.
 */
public class ChainContants {

    public static final String MESSAGE_TYPE_QQ = "QQ";

    public static final String MESSAGE_TYPE_WECHAT = "微信";

    public static final String MESSAGE_TYPE_SMS = "短信";

    private static final String resultFormat = "%s 客户端发送 %s消息成功，消息内容：%s";

    private static final String unHandlerFormat = "不是%s类型消息，%s客户端不处理!消息类型为：%s";

    public static String getFormatResult(Message message) {
        return String.format(ChainContants.resultFormat, message.getType(), message.getType(), message.getContext());
    }

    public static String getUnHandlerFormat(String currentType, Message message) {
        return String.format(ChainContants.unHandlerFormat, currentType, currentType, message.getType());
    }

}

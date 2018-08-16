package cn.zhangyuying.designpattern.simplefactory;

/**
 * @author zyy.
 */
public enum SendType {
    /**
     * qq类型
     */
    QQ(1, "qq消息"),

    /**
     * 微信类型
     */
    WECHAT(2, "微信消息"),

    /**
     * 短信类型
     */
    SMS(3, "短信消息");

    /**
     * 类型的值
     */
    private int value = 0;

    /**
     * 类型的描述信息
     */
    private String describe;

    /**
     * 构造函数
     *
     * @param value 类型值
     * @param describe 类型描述
     */
    SendType(int value, String describe) {
        this.value = value;
        this.describe = describe;
    }


}

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
     * 模式的值
     */
    private int value = 0;

    /**
     * 模式的描述信息
     */
    private String describe;

    /**
     * 构造函数
     *
     * @param value 模式值
     * @param describe 模式描述
     */
    SendType(int value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    /**
     * 获取类型值
     *
     * @return 模式值
     */
    public int getValue() {
        return value;
    }

    /**
     * 获取类型描述信息
     *
     * @return 模式描述信息
     */
    public String getDescribe() {
        return describe;
    }
}

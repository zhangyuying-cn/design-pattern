package cn.zhangyuying.designpattern.state;

/**
 * @author zyy.
 */
public enum MsgSendState {

    /**
     * qq类型
     */
    SUCCESS(1, "发送成功"),

    /**
     * 微信类型
     */
    FAIL(2, "发送失败"),

    /**
     * 短信类型
     */
    RETRY(3, "带重试");

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
    MsgSendState(int value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}

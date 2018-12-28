package cn.zhangyuying.designpattern.flyweight;

/**
 * @author zyy.
 */
public enum MsgType {

    QQ("QQ"), SMS("短信"), WECHAT("微信");

    private String describe;

    MsgType(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }
}

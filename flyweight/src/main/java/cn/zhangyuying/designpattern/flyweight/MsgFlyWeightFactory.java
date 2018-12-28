package cn.zhangyuying.designpattern.flyweight;

import cn.zhangyuying.designpattern.flyweight.impl.QQFlyWeight;
import cn.zhangyuying.designpattern.flyweight.impl.SMSFlyWeight;
import cn.zhangyuying.designpattern.flyweight.impl.WeChatFlyWeight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zyy.
 */
class MsgFlyWeightFactory {
    private Map<MsgType, MsgFlyWeight> flyWeightMap = new ConcurrentHashMap<>();

    MsgFlyWeight getMsgClient(MsgType msgType) {
        MsgFlyWeight flyWeight = flyWeightMap.get(msgType);
        if (flyWeight != null) {
            return flyWeight;
        }
        switch (msgType) {
            case QQ:
                flyWeight = new QQFlyWeight(msgType);
                break;
            case SMS:
                flyWeight = new SMSFlyWeight(msgType);
                break;
            case WECHAT:
                flyWeight = new WeChatFlyWeight(msgType);
                break;
            default:
                throw new IllegalArgumentException("传入的消息客户端类型不存在。");
        }
        flyWeightMap.put(msgType, flyWeight);
        return flyWeight;
    }

    public int getAllFlyWeightSize() {
        return flyWeightMap.size();
    }

}

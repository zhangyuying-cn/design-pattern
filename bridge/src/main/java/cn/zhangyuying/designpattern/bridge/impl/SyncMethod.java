package cn.zhangyuying.designpattern.bridge.impl;

import cn.zhangyuying.designpattern.bridge.SendMethod;

/**
 * 同步方式
 * @author zyy.
 */
public class SyncMethod implements SendMethod {

    @Override
    public String getSendMsgResultByMethod(String messageClient) {
        return "同步方式调用 " + messageClient + " 发送请求";
    }
}

package cn.zhangyuying.designpattern.bridge.impl;

import cn.zhangyuying.designpattern.bridge.SendMethod;

/**
 * 异步方式
 * @author zyy.
 */
public class AsyncMethod implements SendMethod {

    @Override
    public String getSendMsgResultByMethod(String messageClient) {
        return "异步方式调用 " + messageClient + " 发送请求";
    }
}

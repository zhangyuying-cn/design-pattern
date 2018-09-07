package cn.zhangyuying.designpattern.adapter.adapter;

import cn.zhangyuying.designpattern.adapter.MsgSender;
import cn.zhangyuying.designpattern.adapter.SignalSender;

/**
 * @author zyy.
 * java中没有多继承，类适配器模式发挥的作用不是很大
 */
public class SignalClassAdapter extends MsgSender implements SignalSender {
    @Override
    public void sendSignal(String signal) {
        sendMessage(signal);
    }
}

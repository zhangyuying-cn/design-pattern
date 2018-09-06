package cn.zhangyuying.designpattern.adapter.adapter;

import cn.zhangyuying.designpattern.adapter.MsgSender;
import cn.zhangyuying.designpattern.adapter.SignalSender;

/**
 * @author zyy.
 */
public class SignalClassAdapter extends MsgSender implements SignalSender {
    @Override
    public void sendSignal(String signal) {
        sendMessage(signal);
    }
}

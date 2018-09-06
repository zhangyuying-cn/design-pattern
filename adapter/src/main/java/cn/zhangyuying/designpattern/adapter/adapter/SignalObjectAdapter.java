package cn.zhangyuying.designpattern.adapter.adapter;

import cn.zhangyuying.designpattern.adapter.MsgSender;
import cn.zhangyuying.designpattern.adapter.SignalSender;

/**
 * @author zyy.
 */
public class SignalObjectAdapter implements SignalSender {
    private MsgSender msgSender;

    public SignalObjectAdapter() {
        msgSender = new MsgSender();
    }

    @Override
    public void sendSignal(String signal) {
        msgSender.sendMessage(signal);
    }
}

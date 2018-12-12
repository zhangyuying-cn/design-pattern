package cn.zhangyuying.designpattern.state;

import cn.zhangyuying.designpattern.state.impl.MsgSuccessState;

/**
 * @author zyy.
 */
public class MsgContext {

    private MsgState msgState;

    MsgContext() {
        this.msgState = new MsgSuccessState();
    }

    public void handleState(MsgSendState msgSendState) {
        msgState.handle(this, msgSendState);
    }

    public void changeState(MsgState msgState, MsgSendState msgSendState) {
        this.msgState = msgState;
        handleState(msgSendState);
    }
}

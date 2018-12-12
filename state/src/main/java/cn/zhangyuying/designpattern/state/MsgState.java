package cn.zhangyuying.designpattern.state;

/**
 * @author zyy.
 */
public abstract class MsgState {

    public abstract void handle(MsgContext msgContext, MsgSendState msgSendState);

}

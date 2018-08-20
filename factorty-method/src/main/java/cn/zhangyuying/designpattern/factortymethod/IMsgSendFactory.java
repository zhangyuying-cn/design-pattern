package cn.zhangyuying.designpattern.factortymethod;

/**
 * @author zyy.
 */
public interface IMsgSendFactory {
    IMsgSender createMsgSender();
}

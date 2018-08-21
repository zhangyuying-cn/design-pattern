package cn.zhangyuying.designpattern.abstractfactory;

/**
 * @author zyy.
 */
public interface IMsgPlatformFactory {

    IQQSender createQQSender();

    ISMSSender createSMSSender();

    IWeChatSender createWeChatSender();
}

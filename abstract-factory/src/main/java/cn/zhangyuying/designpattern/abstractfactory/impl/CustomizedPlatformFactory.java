package cn.zhangyuying.designpattern.abstractfactory.impl;

import cn.zhangyuying.designpattern.abstractfactory.IMsgPlatformFactory;
import cn.zhangyuying.designpattern.abstractfactory.IQQSender;
import cn.zhangyuying.designpattern.abstractfactory.ISMSSender;
import cn.zhangyuying.designpattern.abstractfactory.IWeChatSender;
import cn.zhangyuying.designpattern.abstractfactory.impl.customized.CustomizedQQSender;
import cn.zhangyuying.designpattern.abstractfactory.impl.customized.CustomizedSMSSender;
import cn.zhangyuying.designpattern.abstractfactory.impl.customized.CustomizedWeChatSender;

/**
 * @author zyy.
 */
public class CustomizedPlatformFactory implements IMsgPlatformFactory {
    @Override
    public IQQSender createQQSender() {
        return new CustomizedQQSender();
    }

    @Override
    public ISMSSender createSMSSender() {
        return new CustomizedSMSSender();
    }

    @Override
    public IWeChatSender createWeChatSender() {
        return new CustomizedWeChatSender();
    }
}

package cn.zhangyuying.designpattern.abstractfactory.impl;

import cn.zhangyuying.designpattern.abstractfactory.IMsgPlatformFactory;
import cn.zhangyuying.designpattern.abstractfactory.IQQSender;
import cn.zhangyuying.designpattern.abstractfactory.ISMSSender;
import cn.zhangyuying.designpattern.abstractfactory.IWeChatSender;
import cn.zhangyuying.designpattern.abstractfactory.impl.unified.UnifiedQQSender;
import cn.zhangyuying.designpattern.abstractfactory.impl.unified.UnifiedSMSSender;
import cn.zhangyuying.designpattern.abstractfactory.impl.unified.UnifiedWeChatSender;

/**
 * @author zyy.
 */
public class UnifiedPlatformFactory implements IMsgPlatformFactory {
    @Override
    public IQQSender createQQSender() {
        return new UnifiedQQSender();
    }

    @Override
    public ISMSSender createSMSSender() {
        return new UnifiedSMSSender();
    }

    @Override
    public IWeChatSender createWeChatSender() {
        return new UnifiedWeChatSender();
    }
}

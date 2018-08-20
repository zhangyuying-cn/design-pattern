package cn.zhangyuying.designpattern.factortymethod.impl;

import cn.zhangyuying.designpattern.factortymethod.IMsgSendFactory;
import cn.zhangyuying.designpattern.factortymethod.IMsgSender;

/**
 * @author zyy.
 */
public class WechatSendFactory implements IMsgSendFactory {
    @Override
    public IMsgSender createMsgSender() {
        return new WeChatSender();
    }
}

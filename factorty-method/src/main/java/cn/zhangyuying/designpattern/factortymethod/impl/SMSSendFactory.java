package cn.zhangyuying.designpattern.factortymethod.impl;

import cn.zhangyuying.designpattern.factortymethod.IMsgSendFactory;
import cn.zhangyuying.designpattern.factortymethod.IMsgSender;

/**
 * @author zyy.
 */
public class SMSSendFactory implements IMsgSendFactory {
    @Override
    public IMsgSender createMsgSender() {
        return new SMSSender();
    }
}

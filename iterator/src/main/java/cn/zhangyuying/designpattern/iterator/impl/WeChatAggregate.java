package cn.zhangyuying.designpattern.iterator.impl;

import cn.zhangyuying.designpattern.iterator.IMsgAggregate;
import cn.zhangyuying.designpattern.iterator.IMsgIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyy.
 */
public class WeChatAggregate implements IMsgAggregate {
    private List<Object> messages = new ArrayList<>();

    @Override
    public IMsgIterator createIterator() {
        return new WeChatIterator(this);
    }

    @Override
    public void addItem(Object item) {
        messages.add(item);
    }

    List getMessages() {
        return messages;
    }

}

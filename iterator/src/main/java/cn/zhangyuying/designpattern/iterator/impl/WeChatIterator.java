package cn.zhangyuying.designpattern.iterator.impl;

import cn.zhangyuying.designpattern.iterator.IMsgIterator;

/**
 * @author zyy.
 */
public class WeChatIterator implements IMsgIterator {

    private WeChatAggregate msgAggregate;

    private Integer index;

    private Integer size;

    public WeChatIterator(WeChatAggregate msgAggregate) {
        if (msgAggregate == null) {
            throw new NullPointerException();
        }
        this.msgAggregate = msgAggregate;
        this.index = 0;
        this.size = msgAggregate.getMessages().size();
    }

    @Override
    public Object next() {
        Integer nextIndex = index++;
        if (nextIndex.compareTo(size) < 0) {
            return msgAggregate.getMessages().get(nextIndex);
        }
        return null;
    }

    @Override
    public Boolean isDone() {
        return index.compareTo(size) >= 0;
    }

    @Override
    public Object currentItem() {
        if (index.compareTo(size) < 0) {
            return msgAggregate.getMessages().get(index);
        }
        throw new NullPointerException("当前操作元素为null!");
    }
}

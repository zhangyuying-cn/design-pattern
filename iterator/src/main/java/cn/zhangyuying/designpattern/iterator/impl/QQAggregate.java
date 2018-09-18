package cn.zhangyuying.designpattern.iterator.impl;

import cn.zhangyuying.designpattern.iterator.IMsgAggregate;
import cn.zhangyuying.designpattern.iterator.IMsgIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyy.
 */
public class QQAggregate implements IMsgAggregate {

    List<Object> messages = new ArrayList<>();

    @Override
    public IMsgIterator createIterator() {
        return new QQIterator();
    }

    @Override
    public void addItem(Object item) {
        messages.add(item);
    }

    private class QQIterator implements IMsgIterator {
        private Integer index;

        private Integer size;

        public QQIterator() {
            this.index = 0;
            this.size = messages.size();
        }

        @Override
        public Object next() {
            Integer nextIndex = index++;
            if (nextIndex.compareTo(size) < 0) {
                return messages.get(nextIndex);
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
                return messages.get(index);
            }
            throw new NullPointerException("当前操作元素为null!");
        }
    }
}

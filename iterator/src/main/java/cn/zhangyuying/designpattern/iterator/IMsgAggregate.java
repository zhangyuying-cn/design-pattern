package cn.zhangyuying.designpattern.iterator;

/**
 * @author zyy.
 */
public interface IMsgAggregate {

    IMsgIterator createIterator();

    void addItem(Object item);
}

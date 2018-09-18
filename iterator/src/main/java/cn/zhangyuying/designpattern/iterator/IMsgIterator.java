package cn.zhangyuying.designpattern.iterator;

/**
 * @author zyy.
 */
public interface IMsgIterator {

    Object next();

    Boolean isDone();

    Object currentItem();
}

package cn.zhangyuying.designpattern.command;

/**
 * @author zyy.
 */
public interface Receiver {
    void on();

    void close();

    void next();

    void previous();

    void regresses();
}

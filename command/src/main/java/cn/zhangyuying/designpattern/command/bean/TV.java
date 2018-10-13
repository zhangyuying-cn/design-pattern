package cn.zhangyuying.designpattern.command.bean;

/**
 * @author zyy.
 */
public class TV {

    private static TV tv = new TV();

    private boolean on;

    /**
     * 当前电视所在的频道
     */
    private int current;

    /**
     * 电视的上一个频道
     */
    private int history;

    private TV() {
        on = false;
    }

    public static TV instance() {
        return tv;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

}

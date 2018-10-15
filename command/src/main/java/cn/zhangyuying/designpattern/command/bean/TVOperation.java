package cn.zhangyuying.designpattern.command.bean;

/**
 * @author zyy.
 */
public enum TVOperation {
    ON(1, "on"), NEXT(2, "next"), PREVIOUS(3, "previous"), REGRESSES(4, "regresses"), CLOSE(5, "close"), MACRO(6, "macro");

    private int point;

    private String describe;

    TVOperation(int point, String describe) {
        this.point = point;
        this.describe = describe;
    }

    public int getPoint() {
        return point;
    }

    public String getDescribe() {
        return describe;
    }
}

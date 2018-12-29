package cn.zhangyuying.designpattern.visitor;

/**
 * @author zyy.
 */
public abstract class MessageElement {
    private String name;

    private String method;

    private String theme;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public abstract void accept(IMessageVisitor messageVisitor);
}

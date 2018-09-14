package cn.zhangyuying.designpattern.composite.safety;

/**
 * @author zyy.
 */
public abstract class AbstractSafetyOrganization {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

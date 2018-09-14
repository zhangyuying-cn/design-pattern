package cn.zhangyuying.designpattern.composite.transparent;

/**
 * @author zyy.
 */
public abstract class AbstractOrganization {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(AbstractOrganization organization);

    public abstract void delete(AbstractOrganization organization);

}

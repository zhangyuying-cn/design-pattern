package cn.zhangyuying.designpattern.composite.transparent.organization;

import cn.zhangyuying.designpattern.composite.transparent.AbstractOrganization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyy.
 */
public class Corp extends AbstractOrganization {

    List<AbstractOrganization> children = new ArrayList<>();

    public Corp(String name) {
        this.name = name;
    }

    public List<AbstractOrganization> getChildren() {
        return children;
    }

    public void setChildren(List<AbstractOrganization> children) {
        this.children = children;
    }

    @Override
    public void add(AbstractOrganization organization) {
        children.add(organization);
    }

    @Override
    public void delete(AbstractOrganization organization) {
        children.remove(organization);
    }
}

package cn.zhangyuying.designpattern.composite.transparent.organization;

import cn.zhangyuying.designpattern.composite.transparent.AbstractOrganization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyy.
 */
public class Dept extends AbstractOrganization {

    private List<AbstractOrganization> children = new ArrayList<>();

    public Dept(String name) {
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

package cn.zhangyuying.designpattern.composite.safety.organization;


import cn.zhangyuying.designpattern.composite.safety.AbstractSafetyOrganization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyy.
 */
public class SafetyDept extends AbstractSafetyOrganization {

    private List<AbstractSafetyOrganization> children = new ArrayList<>();

    public SafetyDept(String name) {
        this.name = name;
    }

    public List<AbstractSafetyOrganization> getChildren() {
        return children;
    }

    public void setChildren(List<AbstractSafetyOrganization> children) {
        this.children = children;
    }

    public void add(AbstractSafetyOrganization organization) {
        children.add(organization);
    }

    public void delete(AbstractSafetyOrganization organization) {
        children.remove(organization);
    }
}

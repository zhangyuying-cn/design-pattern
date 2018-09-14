package cn.zhangyuying.designpattern.composite.transparent.organization;

import cn.zhangyuying.designpattern.composite.transparent.AbstractOrganization;

/**
 * @author zyy.
 */
public class User extends AbstractOrganization {

    public User(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractOrganization organization) {
        throw new IllegalArgumentException("user can not add");
    }

    @Override
    public void delete(AbstractOrganization organization) {
        throw new IllegalArgumentException("user can not delete");
    }
}

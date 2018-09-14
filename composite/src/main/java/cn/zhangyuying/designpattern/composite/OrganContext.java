package cn.zhangyuying.designpattern.composite;

import cn.zhangyuying.designpattern.composite.safety.AbstractSafetyOrganization;
import cn.zhangyuying.designpattern.composite.transparent.AbstractOrganization;
import cn.zhangyuying.designpattern.composite.transparent.organization.Corp;
import cn.zhangyuying.designpattern.composite.transparent.organization.Dept;
import cn.zhangyuying.designpattern.composite.transparent.organization.User;
import cn.zhangyuying.designpattern.composite.safety.organization.SafetyCorp;
import cn.zhangyuying.designpattern.composite.safety.organization.SafetyDept;
import cn.zhangyuying.designpattern.composite.safety.organization.SafetyUser;

/**
 * @author zyy.
 */
public class OrganContext {
    public static AbstractSafetyOrganization getSafetyOrganizationTree() {
        SafetyCorp organization = new SafetyCorp("root:总公司");
        SafetyDept developmentDept = new SafetyDept("总公司财务部");
        SafetyDept financeDept = new SafetyDept("总公司财务部");
        developmentDept.add(new SafetyUser("总公司开发部人员"));
        financeDept.add(new SafetyUser("总公司财务部人员"));
        organization.add(financeDept);
        organization.add(developmentDept);
        organization.add(new SafetyUser("总公司的领导"));
        SafetyCorp partOrganization = new SafetyCorp("第一分公司");
        partOrganization.add(new SafetyUser("第一分公司直属人员"));
        SafetyDept partDevelopmentDept = new SafetyDept("第一分公司的财务部");
        SafetyDept partFinanceDept = new SafetyDept("第一分公司的开发部");
        partDevelopmentDept.add(new SafetyUser("第一分公司的财务部人员"));
        partFinanceDept.add(new SafetyUser("第一分公司的开发部人员"));
        partOrganization.add(partDevelopmentDept);
        partOrganization.add(partFinanceDept);
        organization.add(partOrganization);

        return organization;
    }

    public static AbstractOrganization getOrganizationTree() {
        AbstractOrganization organization = new Corp("root:总公司");
        AbstractOrganization developmentDept = new Dept("总公司财务部");
        AbstractOrganization financeDept = new Dept("总公司财务部");
        developmentDept.add(new User("总公司开发部人员"));
        financeDept.add(new User("总公司财务部人员"));
        organization.add(financeDept);
        organization.add(developmentDept);
        organization.add(new User("总公司的领导"));
        AbstractOrganization partOrganization = new Corp("第一分公司");
        partOrganization.add(new User("第一分公司直属人员"));
        AbstractOrganization partDevelopmentDept = new Dept("第一分公司的财务部");
        AbstractOrganization partFinanceDept = new Dept("第一分公司的开发部");
        partDevelopmentDept.add(new User("第一分公司的财务部人员"));
        partFinanceDept.add(new User("第一分公司的开发部人员"));
        partOrganization.add(partDevelopmentDept);
        partOrganization.add(partFinanceDept);
        organization.add(partOrganization);

        return organization;
    }

}

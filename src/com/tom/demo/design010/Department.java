package com.tom.demo.design010;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZX
 * @Date 2020/4/26 19:41
 * @Version 1.0
 */
public class Department extends Organization {
    private List<Organization> list = new ArrayList<>();


    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Organization organization) {
        list.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        list.remove(organization);
    }

    @Override
    public void print() {
        System.out.println(getName());
        for (Organization organization : list) {
            organization.print();
        }
    }


}

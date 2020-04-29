package com.tom.demo.design017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author ZX
 * @Date 2020/4/29 16:12
 * @Version 1.0
 */
public class InfoCollege implements College {
    private List<Department> list;

    public InfoCollege() {
        list = new ArrayList<>();
        addDepartment("TCP", "TCP");
        addDepartment("IP", "IP");
        addDepartment("HTTP", "HTTP");
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department();
        department.setName(name);
        department.setDesc(desc);
        list.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoIterator(list);
    }
}

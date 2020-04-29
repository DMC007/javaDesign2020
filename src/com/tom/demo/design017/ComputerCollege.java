package com.tom.demo.design017;

import java.util.Iterator;

/**
 * @Author ZX
 * @Date 2020/4/29 16:05
 * @Version 1.0
 */
public class ComputerCollege implements College {
    private Department[] departments;
    private int index = 0;

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("java", "java");
        addDepartment("php", "php");
        addDepartment("c++", "c++");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department();
        department.setName(name);
        department.setDesc(desc);
        departments[index] = department;
        index += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerIterator(departments);
    }
}

package com.tom.demo.design017;

import java.util.Iterator;
import java.util.List;

/**
 * @Author ZX
 * @Date 2020/4/29 16:15
 * @Version 1.0
 */
public class OutPut {
    private List<College> list;

    public OutPut(List<College> list) {
        this.list = list;
    }

    public void printC() {
        for (College college : list) {
            System.out.println("====" + college.getName() + "====");
            printD(college.createIterator());
        }
    }

    public void printD(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}

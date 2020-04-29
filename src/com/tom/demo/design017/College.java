package com.tom.demo.design017;

import java.util.Iterator;

/**
 * @Author ZX
 * @Date 2020/4/29 16:01
 * @Version 1.0
 */
public interface College {
    String getName();

    void addDepartment(String name, String desc);

    Iterator createIterator();
}

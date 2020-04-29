package com.tom.demo.design017;

import java.util.Iterator;

/**
 * @Author ZX
 * @Date 2020/4/29 15:53
 * @Version 1.0
 */
public class ComputerIterator implements Iterator {
    private Department[] departments;
    private int index = 0;

    public ComputerIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.length || departments[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[index];
        index += 1;
        return department;
    }
}

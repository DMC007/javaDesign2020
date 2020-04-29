package com.tom.demo.design017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author ZX
 * @Date 2020/4/29 15:58
 * @Version 1.0
 */
public class InfoIterator implements Iterator {
    private List<Department> list;
    private int index = -1;

    public InfoIterator(List<Department> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return list.get(index);
    }
}

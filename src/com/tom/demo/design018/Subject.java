package com.tom.demo.design018;

/**
 * @Author ZX
 * @Date 2020/5/4 11:12
 * @Version 1.0
 */
public interface Subject {
    void add(Observe observe);

    void remove(Observe observe);

    void notifyObjects();
}

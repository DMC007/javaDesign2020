package com.tom.demo.design016;

/**
 * @Author ZX
 * @Date 2020/4/29 12:23
 * @Version 1.0
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult();
    }
}

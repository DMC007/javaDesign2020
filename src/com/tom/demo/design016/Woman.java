package com.tom.demo.design016;

/**
 * @Author ZX
 * @Date 2020/4/29 12:24
 * @Version 1.0
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWoManResult();
    }
}

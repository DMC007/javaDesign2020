package com.tom.demo.design04;

/**
 * @Author ZX
 * @Date 2020/4/19 20:46
 * @Version 1.0
 */
public class USACarFactory implements CarFactory {
    @Override
    public Car create001() {
        return new USACar001();
    }

    @Override
    public Car create007() {
        return new USACar007();
    }
}

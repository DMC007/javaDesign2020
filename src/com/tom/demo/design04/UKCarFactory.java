package com.tom.demo.design04;

/**
 * @Author ZX
 * @Date 2020/4/19 20:39
 * @Version 1.0
 */
public class UKCarFactory implements CarFactory {
    @Override
    public Car create001() {
        return new UKCar001();
    }

    @Override
    public Car create007() {
        return new UKCar007();
    }
}

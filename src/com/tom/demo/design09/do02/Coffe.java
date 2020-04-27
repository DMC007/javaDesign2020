package com.tom.demo.design09.do02;

/**
 * @Author ZX
 * @Date 2020/4/21 22:00
 * @Version 1.0
 */
public class Coffe extends Drink {
    @Override
    public double cost() {
        return super.getPrice();
    }
}

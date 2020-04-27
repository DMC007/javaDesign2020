package com.tom.demo.design09.do01;

/**
 * @Author ZX
 * @Date 2020/4/26 18:09
 * @Version 1.0
 */
public class Coffe extends Drink {

    @Override
    public int cost() {
        return super.getPrice();
    }
}

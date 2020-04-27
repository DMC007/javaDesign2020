package com.tom.demo.design09.do01;

/**
 * @Author ZX
 * @Date 2020/4/26 18:15
 * @Version 1.0
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setPrice(10);
        setDesc("牛奶");
    }
}

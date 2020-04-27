package com.tom.demo.design09.do02;

/**
 * @Author ZX
 * @Date 2020/3/8 13:52
 * @Version 1.0
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(20d);
    }
}

package com.tom.demo.design09.do01;

/**
 * @Author ZX
 * @Date 2020/4/26 18:11
 * @Version 1.0
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public int cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ":" + super.getPrice() + "&&" + drink.getDesc();
    }
}

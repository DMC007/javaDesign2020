package com.tom.demo.design09.do01;

/**
 * @Author ZX
 * @Date 2020/4/26 18:16
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Drink drink = new LongBackCoffe();
        System.out.println(drink.getDesc() + ">" + drink.cost());

        drink = new Milk(drink);
        System.out.println(drink.getDesc() + ">" + drink.cost());
    }
}

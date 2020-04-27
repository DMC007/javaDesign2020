package com.tom.demo.design03;

/**
 * @Author ZX
 * @Date 2020/4/19 20:24
 * @Version 1.0
 */
public class Demo {
    //工厂方法模式
    public static void main(String[] args) {
        FruitFactory factory = new AppleFactory();
        Fruit fruit = factory.create();
        fruit.juice();
        FruitFactory factory2 = new BananaFactory();
        Fruit fruit2 = factory2.create();
        fruit2.juice();
    }
}

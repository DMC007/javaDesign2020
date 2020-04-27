package com.tom.demo.design03;

/**
 * @Author ZX
 * @Date 2020/4/19 20:23
 * @Version 1.0
 */
public class BananaFactory extends FruitFactory {
    @Override
    public Fruit create() {
        return new Banana();
    }
}

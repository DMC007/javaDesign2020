package com.tom.demo.design02;

/**
 * @Author ZX
 * @Date 2020/4/19 19:45
 * @Version 1.0
 */
public class Demo {
    //简单工厂模式
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Animal animal = AnimalFactory.create("com.tom.demo.design02.Cat");
        animal.eat();
    }
}


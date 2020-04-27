package com.tom.demo.design04;

/**
 * @Author ZX
 * @Date 2020/4/19 20:47
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        CarFactory ukCarFactory = new UKCarFactory();
        CarFactory usaCarFactory = new USACarFactory();
        ukCarFactory.create001().info();
        ukCarFactory.create007().info();
        usaCarFactory.create001().info();
        usaCarFactory.create007().info();

    }
}

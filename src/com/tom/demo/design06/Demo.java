package com.tom.demo.design06;

/**
 * @Author ZX
 * @Date 2020/4/19 22:14
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        houseDirector.doHouse();
    }
}

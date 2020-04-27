package com.tom.demo.design06;

/**
 * @Author ZX
 * @Date 2020/4/19 22:02
 * @Version 1.0
 */
public abstract class HouseBuilder {
    private House house = new House();

    public abstract void createWall();

    public abstract void createFloor();

    public abstract void createRoof();

    public House build() {
        return house;
    }
}

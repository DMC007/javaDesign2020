package com.tom.demo.design06;

/**
 * @Author ZX
 * @Date 2020/4/19 22:10
 * @Version 1.0
 */
public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House doHouse() {
        houseBuilder.createFloor();
        houseBuilder.createWall();
        houseBuilder.createRoof();
        House house = houseBuilder.build();
        return house;
    }
}

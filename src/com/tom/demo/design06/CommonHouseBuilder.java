package com.tom.demo.design06;

/**
 * @Author ZX
 * @Date 2020/4/19 22:07
 * @Version 1.0
 */
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void createWall() {
        System.out.println("普通房子修墙");
    }

    @Override
    public void createFloor() {
        System.out.println("普通房子贴地板");
    }

    @Override
    public void createRoof() {
        System.out.println("普通房子盖屋顶");
    }
}

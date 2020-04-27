package com.tom.demo.design06;

/**
 * @Author ZX
 * @Date 2020/4/19 22:09
 * @Version 1.0
 */
public class FasionHouseBuilder extends HouseBuilder {
    @Override
    public void createWall() {
        System.out.println("时髦房子修墙");
    }

    @Override
    public void createFloor() {
        System.out.println("时髦房子贴地板");
    }

    @Override
    public void createRoof() {
        System.out.println("时髦房子盖屋顶");
    }
}

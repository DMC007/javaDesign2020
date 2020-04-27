package com.tom.demo.design07.demo01;

/**
 * @Author ZX
 * @Date 2020/4/19 23:10
 * @Version 1.0
 */
public class VoltageAdaptor extends Voltage200V implements Voltage5V {
    @Override
    public int output5() {
        int i = output220();
        System.out.println("这是5V电压");
        return i/44;
    }
}

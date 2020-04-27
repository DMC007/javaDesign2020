package com.tom.demo.design07.demo01;

/**
 * @Author ZX
 * @Date 2020/4/19 23:15
 * @Version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        VoltageAdaptor voltageAdaptor = new VoltageAdaptor();

        Iphone6 ip = new Iphone6();
        ip.change(voltageAdaptor);
    }
}

package com.tom.demo.design07.demo01;

/**
 * @Author ZX
 * @Date 2020/4/19 23:14
 * @Version 1.0
 */
public class Iphone6 {
    public void change(Voltage5V v) {
        int i = v.output5();
        if (i == 5) {
            System.out.println("电压正常");
        } else {
            System.out.println("电压不正常");
        }
    }
}

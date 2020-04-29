package com.tom.demo.design011;

/**
 * @Author ZX
 * @Date 2020/4/26 21:03
 * @Version 1.0
 */
public class Demo {
    //外观模式
    public static void main(String[] args) {
        Combination combination = new Combination();
        combination.open();
        combination.close();
    }
}

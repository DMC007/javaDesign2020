package com.tom.demo.design014;

/**
 * @Author ZX
 * @Date 2020/4/28 21:44
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        AbstractMilk milk = new USAMilk();
        milk.make();
        System.out.println("========");
        AbstractMilk milk1 = new UKMilk();
        milk1.make();
        System.out.println("=========");
        AbstractMilk milk2 = new ChinaMilk();
        milk2.make();
    }
}

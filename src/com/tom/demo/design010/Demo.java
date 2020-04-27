package com.tom.demo.design010;

/**
 * @Author ZX
 * @Date 2020/4/26 19:48
 * @Version 1.0
 */
public class Demo {
    //组合模式
    public static void main(String[] args) {
        University u1 = new University("清华大学", "很牛逼");

        Department d1 = new Department("美术学院", "学美术");
        Department d2 = new Department("体育学院", "学体育");

        Profession p1 = new Profession("彩绘", "很重要");
        Profession p2 = new Profession("素描", "一般");

        Profession p3 = new Profession("田径", "天天跑步");

        d1.add(p1);
        d1.add(p2);
        d2.add(p3);

        u1.add(d1);
        u1.add(d2);

        u1.print();

    }
}

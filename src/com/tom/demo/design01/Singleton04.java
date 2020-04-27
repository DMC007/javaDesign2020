package com.tom.demo.design01;

/**
 * @Author ZX
 * @Date 2020/4/19 18:09
 * @Version 1.0
 */
public class Singleton04 {
    public static void main(String[] args) {
        MyInstance m1 = MyInstance.INSTANCE;
        MyInstance m2 = MyInstance.INSTANCE;
        System.out.println(m1 == m2);
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
    }
}

enum MyInstance {
    INSTANCE;

    public void sya() {
        System.out.println("666");
    }
}

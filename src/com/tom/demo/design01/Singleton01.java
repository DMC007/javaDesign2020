package com.tom.demo.design01;

/**
 * @Author ZX
 * @Date 2020/4/19 17:53
 * @Version 1.0
 */
public class Singleton01 {
    //饿汉式
    private static final Singleton01 SINGLETON_01 = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return SINGLETON_01;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

package com.tom.demo.design01;

/**
 * @Author ZX
 * @Date 2020/4/19 18:03
 * @Version 1.0
 */
public class Singleton03 {
    //静态内部类
    private Singleton03() {
    }

    private static class MyInner {
        private static final Singleton03 SINGLETON_03 = new Singleton03();
    }

    public static Singleton03 getInstance() {
        return MyInner.SINGLETON_03;
    }

    public static void main(String[] args) {
        Singleton03 s1 = Singleton03.getInstance();
        Singleton03 s2 = Singleton03.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

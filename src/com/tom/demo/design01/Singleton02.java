package com.tom.demo.design01;

/**
 * @Author ZX
 * @Date 2020/4/19 17:56
 * @Version 1.0
 */
public class Singleton02 {
    //懒汉式安全版
    private Singleton02() {
    }

    private static volatile Singleton02 SINGLETON_02;

    public static Singleton02 getInstance() {
        if (SINGLETON_02 == null) {
            synchronized (Singleton02.class) {
                if (SINGLETON_02 == null) {
                    SINGLETON_02 = new Singleton02();
                }
            }
        }
        return SINGLETON_02;
    }

    public static void main(String[] args) {
        Singleton02 s1 = Singleton02.getInstance();
        Singleton02 s2 = Singleton02.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

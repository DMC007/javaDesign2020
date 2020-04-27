package com.tom.demo.design011;

/**
 * @Author ZX
 * @Date 2020/4/26 21:03
 * @Version 1.0
 */
public class DVD {
    private static final DVD dvd = new DVD();

    private DVD() {
    }

    public static DVD getDvd() {
        return dvd;
    }

    public void open() {
        System.out.println("DVD打开");
    }

    public void close() {
        System.out.println("DVD关闭");
    }

}

package com.tom.demo.design011;

/**
 * @Author ZX
 * @Date 2020/4/26 21:04
 * @Version 1.0
 */
public class Screen {
    private static final Screen sc = new Screen();

    private Screen() {
    }

    public static Screen getSc() {
        return sc;
    }

    public void open() {
        System.out.println("Screen打开");
    }

    public void close() {
        System.out.println("Screen关闭");
    }

}

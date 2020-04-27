package com.tom.demo.design08;

/**
 * @Author ZX
 * @Date 2020/4/20 11:16
 * @Version 1.0
 */
public class VivoBrand implements Brand {
    @Override
    public void open() {
        System.out.println("vivo手机打开");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关闭");
    }
}

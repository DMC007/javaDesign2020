package com.tom.demo.design08;

/**
 * @Author ZX
 * @Date 2020/4/20 11:15
 * @Version 1.0
 */
public class XiaomiBrand implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机打开");
    }

    @Override
    public void close() {
        System.out.println("小米手机关闭");
    }
}

package com.tom.demo.design08;

/**
 * @Author ZX
 * @Date 2020/4/20 11:21
 * @Version 1.0
 */
public class IntelligentPhone extends Phone {
    public IntelligentPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("智能手机打开");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("智能手机关闭");
    }
}

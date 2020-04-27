package com.tom.demo.design08;

/**
 * @Author ZX
 * @Date 2020/4/20 11:19
 * @Version 1.0
 */
public class FoldPhone extends Phone {
    public FoldPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠手机打开");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠手机关闭");
    }
}

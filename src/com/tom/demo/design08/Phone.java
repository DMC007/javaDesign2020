package com.tom.demo.design08;

/**
 * @Author ZX
 * @Date 2020/4/20 11:17
 * @Version 1.0
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void close() {
        brand.close();
    }

}

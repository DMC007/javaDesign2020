package com.tom.demo.design09.do02;

/**
 * @Author ZX
 * @Date 2020/4/21 21:57
 * @Version 1.0
 */
public abstract class Drink {
    private String desc;
    private double price = 0.0d;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double cost();
}

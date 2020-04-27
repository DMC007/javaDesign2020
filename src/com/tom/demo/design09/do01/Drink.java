package com.tom.demo.design09.do01;

/**
 * @Author ZX
 * @Date 2020/4/26 18:09
 * @Version 1.0
 */
public abstract class Drink {
    private String desc;
    private int price;

    public abstract int cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

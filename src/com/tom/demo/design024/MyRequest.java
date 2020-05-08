package com.tom.demo.design024;

/**
 * @Author ZX
 * @Date 2020/5/8 19:23
 * @Version 1.0
 */
public class MyRequest {
    private int type;
    private int price;
    private int id;

    public MyRequest(int type, int price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}

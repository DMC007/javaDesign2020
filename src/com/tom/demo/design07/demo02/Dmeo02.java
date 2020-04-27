package com.tom.demo.design07.demo02;

/**
 * @Author ZX
 * @Date 2020/4/19 23:37
 * @Version 1.0
 */
public class Dmeo02 {
    public static void main(String[] args) {
        Man man = new Man();
        man.change(new PCAdaptor(new PCgaojia220()));
    }
}

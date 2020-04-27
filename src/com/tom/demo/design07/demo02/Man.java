package com.tom.demo.design07.demo02;

/**
 * @Author ZX
 * @Date 2020/4/19 23:36
 * @Version 1.0
 */
public class Man {
    public void change(PCgaojia5 p) {
        int i = p.cost5();
        if (i == 5) {
            System.out.println("便宜");
        } else {
            System.out.println("被烧了");
        }
    }
}

package com.tom.demo.design010;

/**
 * @Author ZX
 * @Date 2020/4/26 19:46
 * @Version 1.0
 */
public class Profession extends Organization {

    public Profession(String name, String desc) {
        super(name, desc);
    }


    @Override
    public void print() {
        System.out.println(getName());
    }
}

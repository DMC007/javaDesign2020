package com.tom.demo.design01;

/**
 * @Author ZX
 * @Date 2020/4/19 18:18
 * @Version 1.0
 */
public enum MyEnum {
    ONE(1), TWO(2);

    private int num;

    private MyEnum(int num) {   //枚举默认是私有构造，可以不写private
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

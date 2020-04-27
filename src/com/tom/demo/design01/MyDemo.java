package com.tom.demo.design01;

/**
 * @Author ZX
 * @Date 2020/4/19 18:18
 * @Version 1.0
 */
public class MyDemo {
    public static void main(String[] args) {
//        MyEnum[] values = MyEnum.values();
//        System.out.println(values.length);  //2
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i]);  //ONE,TWO
//        }
        System.out.println(MyEnum.ONE.getNum());    //1
        System.out.println(MyEnum.TWO.getNum());    //2
    }
}

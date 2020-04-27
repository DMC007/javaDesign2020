package com.tom.demo.design09.do02;

/**
 * @Author ZX
 * @Date 2020/4/21 22:11
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Drink coffe = new LongBackCoffe();
        System.out.println(coffe.getDesc() + ":" + coffe.getPrice());
        coffe = new Milk(coffe);
        System.out.println(coffe.getDesc() + ":" + coffe.cost());
//        Drink cofe = new LongBackCoffe();
//        System.out.println(cofe.getDesc() + ":" + cofe.cost());
//
//        cofe = new Milk(cofe);
//        System.out.println("加入一份牛奶费用："+cofe.cost());
//        System.out.println("加入一份牛奶描述："+cofe.getDesc());
    }
}

package com.tom.demo.design023;

/**
 * @Author ZX
 * @Date 2020/5/8 19:01
 * @Version 1.0
 */
public class Demo {
    //策略模式
    public static void main(String[] args) {
        MyContext myContext = new MyContext(new StrategyA());
        System.out.println(myContext.cost(100));
        System.out.println("======================");
        MyContext myContext1 = new MyContext(new StrategyB());
        System.out.println(myContext1.cost(100));
    }
}

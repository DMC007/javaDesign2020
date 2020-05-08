package com.tom.demo.design023;

/**
 * @Author ZX
 * @Date 2020/5/8 19:04
 * @Version 1.0
 */
public class MyContext {
    private AbStrategy strategy;

    public MyContext(AbStrategy strategy) {
        this.strategy = strategy;
    }

    public int cost(int num) {
        return strategy.cost(num);
    }
}

package com.tom.demo.design023;

/**
 * @Author ZX
 * @Date 2020/5/8 19:02
 * @Version 1.0
 */
public class StrategyA implements AbStrategy {
    @Override
    public int cost(int num) {
        if (num > 100) {
            return num - 20;
        }
        return num;
    }
}

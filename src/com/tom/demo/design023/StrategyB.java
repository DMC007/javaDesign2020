package com.tom.demo.design023;

/**
 * @Author ZX
 * @Date 2020/5/8 19:03
 * @Version 1.0
 */
public class StrategyB implements AbStrategy {
    @Override
    public int cost(int num) {
        if (num > 10) {
            return num;
        }
        return num - 10;
    }
}

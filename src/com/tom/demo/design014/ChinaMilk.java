package com.tom.demo.design014;

/**
 * @Author ZX
 * @Date 2020/4/28 21:43
 * @Version 1.0
 */
public class ChinaMilk extends AbstractMilk {
    //中国牛奶不用doit方法，使用原味即可
    @Override
    public void doit() {
    }

    @Override
    public boolean flag() {
        return false;
    }
}

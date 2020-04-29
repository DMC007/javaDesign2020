package com.tom.demo.design014;

/**
 * @Author ZX
 * @Date 2020/4/28 21:39
 * @Version 1.0
 */
public abstract class AbstractMilk {
    final void make() {
        step01();
        step02();
        if (flag()) {
            doit();
        }
        step04();
    }

    public void step01() {
        System.out.println("第一步，找到奶牛");
    }

    public void step02() {
        System.out.println("第二步，挤奶");
    }

    public abstract void doit();

    public void step03() {
        System.out.println("喝奶");
    }

    public void step04() {
        System.out.println("洗碗");
    }

    //钩子方法
    public boolean flag() {
        return true;
    }
}

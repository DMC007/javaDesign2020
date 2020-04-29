package com.tom.demo.design016;

/**
 * @Author ZX
 * @Date 2020/4/29 12:22
 * @Version 1.0
 */
public class Fall extends Action {
    @Override
    public void getManResult() {
        System.out.println("男观众投票失败");
    }

    @Override
    public void getWoManResult() {
        System.out.println("女观众投票失败");
    }
}

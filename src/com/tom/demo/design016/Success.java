package com.tom.demo.design016;

/**
 * @Author ZX
 * @Date 2020/4/29 12:23
 * @Version 1.0
 */
public class Success extends Action {
    @Override
    public void getManResult() {
        System.out.println("男观众投票成功");
    }

    @Override
    public void getWoManResult() {
        System.out.println("女观众投票成功");
    }
}

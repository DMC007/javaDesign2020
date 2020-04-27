package com.tom.demo.design07.demo02;

/**
 * @Author ZX
 * @Date 2020/4/19 23:32
 * @Version 1.0
 */
public class PCAdaptor implements PCgaojia5 {
    private PCgaojia220 p220;

    public PCAdaptor(PCgaojia220 p220) {
        this.p220 = p220;
    }

    @Override
    public int cost5() {
        int i = p220.cost220();
        System.out.println("要花5块");
        return i / 44;
    }
}

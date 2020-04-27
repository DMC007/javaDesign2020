package com.tom.demo.design011;

/**
 * @Author ZX
 * @Date 2020/4/26 21:07
 * @Version 1.0
 */
public class Combination {
    private DVD dvd;
    private Screen screen;

    public Combination() {
        this.dvd = DVD.getDvd();
        this.screen = Screen.getSc();
    }

    public void open(){
        dvd.open();
        screen.open();
    }

    public void close(){
        screen.close();
        dvd.close();
    }
}

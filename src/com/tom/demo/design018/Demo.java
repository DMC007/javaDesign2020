package com.tom.demo.design018;

/**
 * @Author ZX
 * @Date 2020/5/4 11:23
 * @Version 1.0
 */
public class Demo {
    //观察者模式
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Baidu baidu = new Baidu("10", "7HZ");
        weatherData.add(baidu);
        System.out.println("==========");
        weatherData.update("30", "9HZ");
        System.out.println("==========");
        weatherData.update("20", "9HZ");
    }
}

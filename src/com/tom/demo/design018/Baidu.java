package com.tom.demo.design018;

/**
 * @Author ZX
 * @Date 2020/5/4 11:21
 * @Version 1.0
 */
public class Baidu implements Observe {
    private String temperature;
    private String humidity;

    public Baidu(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("百度提醒：今天天气：" + getTemperature());
        System.out.println("百度提醒：今天气压：" + getHumidity());
    }

    @Override
    public void update(String temperature, String humidity) {
        setTemperature(temperature);
        setHumidity(humidity);
        display();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}

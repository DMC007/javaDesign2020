package com.tom.demo.design018;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZX
 * @Date 2020/5/4 11:12
 * @Version 1.0
 */
public class WeatherData implements Subject {

    private String temperature;
    private String humidity;

    private List<Observe> observes;

    public WeatherData() {
        this.observes = new ArrayList<>();
    }

    public void update(String temperature, String humidity) {
        setTemperature(temperature);
        setHumidity(humidity);
        dataChange();
    }

    private void dataChange() {
        notifyObjects();
    }

    @Override
    public void add(Observe o) {
        observes.add(o);
    }

    @Override
    public void remove(Observe o) {
        if (observes.contains(o)) {
            observes.remove(o);
        }
    }

    @Override
    public void notifyObjects() {
        for (Observe o : observes) {
            o.update(getTemperature(), getHumidity());
        }
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

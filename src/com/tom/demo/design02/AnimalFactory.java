package com.tom.demo.design02;

/**
 * @Author ZX
 * @Date 2020/4/19 18:28
 * @Version 1.0
 */
public class AnimalFactory {
    public static Animal create(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Animal) Class.forName(className).newInstance();
    }
}

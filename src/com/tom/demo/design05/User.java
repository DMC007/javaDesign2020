package com.tom.demo.design05;

/**
 * @Author ZX
 * @Date 2020/4/19 21:21
 * @Version 1.0
 */
public class User implements Cloneable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        //浅克隆
        return (User) super.clone();
    }
}

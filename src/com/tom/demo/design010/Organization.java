package com.tom.demo.design010;

/**
 * @Author ZX
 * @Date 2020/4/26 19:39
 * @Version 1.0
 */
public abstract class Organization {
    private String name;
    private String desc;

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void add(Organization organization) {
    }

    ;

    public void remove(Organization organization) {
    }

    ;

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

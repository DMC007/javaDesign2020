package com.tom.demo.design013.do04;

/**
 * @Author ZX
 * @Date 2020/4/26 23:35
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        IPerson person = new IPersonImpl();
        IPerson iPerson = (IPerson) new ProxyObj(person).getInstance();
        iPerson.say();
    }
}

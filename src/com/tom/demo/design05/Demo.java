package com.tom.demo.design05;

import java.util.Arrays;

/**
 * @Author ZX
 * @Date 2020/4/19 21:23
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆
//        User user = new User();
//        user.setName("tom");
//        user.setAge(23);
//        User user2 = user.clone();
//        System.out.println(user == user2);

        //深克隆【1】
//        Person person = new Person();
//        person.setName("tom");
//        person.setAge(23);
//        person.setList(Arrays.asList("jack", "rose", "john"));
//
//        Person p = person.clone();
//        System.out.println(p==person);
//        System.out.println(person.getList() == p.getList());

        //深克隆
        Person person = new Person();
        person.setName("tom");
        person.setAge(23);
        person.setList(Arrays.asList("jack", "rose", "john"));
        Person person2 = person.deepClone();
        System.out.println(person == person2);
        System.out.println(person.getList() == person2.getList());
    }
}

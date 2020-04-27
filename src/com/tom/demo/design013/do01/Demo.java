package com.tom.demo.design013.do01;

/**
 * @Author ZX
 * @Date 2020/4/26 22:55
 * @Version 1.0
 */
public class Demo {
    //静态代理
    public static void main(String[] args) {
        ITeacher teacher = new ProxyTeacher(new ITeacherImpl());
        teacher.teach();
    }
}

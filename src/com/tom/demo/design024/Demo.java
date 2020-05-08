package com.tom.demo.design024;

/**
 * @Author ZX
 * @Date 2020/5/8 19:20
 * @Version 1.0
 */
public class Demo {
    //职责链模式
    public static void main(String[] args) {
        Student100 student100 = new Student100("李四100");
        Student200 student200 = new Student200("李四200");
        Student300 student300 = new Student300("李四300");

        student100.setStudent(student200);
        student200.setStudent(student300);
        student300.setStudent(student100);

        MyRequest myRequest = new MyRequest(1, 200, 1);

        student300.doMyRequest(myRequest);
    }
}

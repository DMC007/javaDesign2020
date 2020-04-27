package com.tom.demo.design08;

/**
 * @Author ZX
 * @Date 2020/4/20 11:22
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Phone phone1 = new FoldPhone(new XiaomiBrand());
        phone1.open();
        phone1.close();

        System.out.println("===========");
        Phone phone2 = new FoldPhone(new VivoBrand());
        phone2.open();
        phone2.close();
    }
}

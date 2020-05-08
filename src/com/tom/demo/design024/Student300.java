package com.tom.demo.design024;

/**
 * @Author ZX
 * @Date 2020/5/8 19:24
 * @Version 1.0
 */
public class Student300 extends Student {
    public Student300(String name) {
        super(name);
    }

    @Override
    public void doMyRequest(MyRequest myRequest) {
        if (myRequest.getPrice() > 200 && myRequest.getPrice() <= 300) {
            System.out.println("编号：" + myRequest.getId() + "被" + this.getName() + "处理");
        } else {
            this.getStudent().doMyRequest(myRequest);
        }
    }
}

package com.tom.demo.design024;

/**
 * @Author ZX
 * @Date 2020/5/8 19:21
 * @Version 1.0
 */
public abstract class Student {
    private Student student;
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public abstract void doMyRequest(MyRequest myRequest);

    public Student getStudent() {
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

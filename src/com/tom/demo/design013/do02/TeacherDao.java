package com.tom.demo.design013.do02;

/**
 * @Author ZX
 * @Date 2020/4/26 23:24
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("教书");
    }
}

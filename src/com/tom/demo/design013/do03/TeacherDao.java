package com.tom.demo.design013.do03;

public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		System.out.println(" 老师教书 ");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}
	
}

package com.tom.demo.design013.do01;

/**
 * @Author ZX
 * @Date 2020/4/26 22:53
 * @Version 1.0
 */
public class ProxyTeacher implements ITeacher {
    private ITeacher iTeacher;

    public ProxyTeacher(ITeacher iTeacher) {
        this.iTeacher = iTeacher;
    }

    @Override
    public void teach() {
        System.out.println("静态代理前---");
        iTeacher.teach();
        System.out.println("静态代理后---");
    }
}

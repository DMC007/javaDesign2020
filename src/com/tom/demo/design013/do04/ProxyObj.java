package com.tom.demo.design013.do04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author ZX
 * @Date 2020/4/26 23:33
 * @Version 1.0
 */
public class ProxyObj {
    private Object object;

    public ProxyObj(Object object) {
        this.object = object;
    }

    public Object getInstance() {
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("前");
                        Object invoke = method.invoke(object, args);
                        System.out.println("后");
                        return invoke;
                    }
                }
        );
    }
}

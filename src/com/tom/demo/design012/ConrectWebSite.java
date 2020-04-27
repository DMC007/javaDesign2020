package com.tom.demo.design012;

/**
 * @Author ZX
 * @Date 2020/4/26 21:45
 * @Version 1.0
 */
public class ConrectWebSite extends WebSite {
    private String type;

    public ConrectWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站类型是：" + type + "使用者是：" + user.getName());
    }
}

package com.tom.demo.design012;

/**
 * @Author ZX
 * @Date 2020/4/26 21:51
 * @Version 1.0
 */
public class Demo {
    //享元模式【内部条件可以重用，用户是外部条件】
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite w1 = webSiteFactory.getWebSite("新闻");
        WebSite w2 = webSiteFactory.getWebSite("公众号");
        WebSite w3 = webSiteFactory.getWebSite("公众号");
        System.out.println(w2 == w3);
        w1.use(new User("tom"));
        w1.use(new User("jack"));
        w2.use(new User("rose"));
        System.out.println(webSiteFactory.getSize());
    }
}

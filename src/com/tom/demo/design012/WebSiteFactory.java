package com.tom.demo.design012;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZX
 * @Date 2020/4/26 21:46
 * @Version 1.0
 */
public class WebSiteFactory {
    private Map<String, WebSite> map = new HashMap<>();

    public WebSite getWebSite(String type) {
        if (!map.containsKey(type)) {
            map.put(type, new ConrectWebSite(type));
        }
        return map.get(type);
    }

    public int getSize() {
        return map.size();
    }
}

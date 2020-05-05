package com.tom.demo.design020;

/**
 * @Author ZX
 * @Date 2020/5/5 20:19
 * @Version 1.0
 */
public class Memento {
    //表示当前攻击力和防御力状态

    private Integer vit;
    private Integer def;

    public Memento(Integer vit, Integer def) {
        this.vit = vit;
        this.def = def;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }
}

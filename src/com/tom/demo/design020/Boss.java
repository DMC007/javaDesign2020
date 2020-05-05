package com.tom.demo.design020;

/**
 * @Author ZX
 * @Date 2020/5/5 20:21
 * @Version 1.0
 */
public class Boss {
    private Integer vit;
    private Integer def;

    //打一个存档
    public Memento create() {
        return new Memento(getVit(), getDef());
    }

    //读档
    public void recover(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display() {
        System.out.println("当前BOSS攻击力：" + getVit() + ",防御力：" + getDef());
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

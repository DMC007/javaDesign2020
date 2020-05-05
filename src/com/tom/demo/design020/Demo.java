package com.tom.demo.design020;

/**
 * @Author ZX
 * @Date 2020/5/5 20:19
 * @Version 1.0
 */
public class Demo {
    //备忘录模式【刷副本，副本刷完boss攻击力血量什么的全部复原】
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setVit(1000);
        boss.setDef(1000);
        boss.display();
        Caretaker caretaker = new Caretaker();
        //存档
        caretaker.setMemento(boss.create());
        System.out.println("===========被玩家攻击一段时间==========");
        boss.setVit(200);
        boss.setDef(20);
        boss.display();
        System.out.println("=======系统刷新，BOSS恢复=======");
        boss.recover(caretaker.getMemento());
        boss.display();
    }
}

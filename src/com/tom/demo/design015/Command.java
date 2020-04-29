package com.tom.demo.design015;

/**
 * @Author ZX
 * @Date 2020/4/28 22:38
 * @Version 1.0
 */
public interface Command {
    void execute();

    void undo();
}

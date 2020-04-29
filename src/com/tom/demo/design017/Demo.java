package com.tom.demo.design017;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZX
 * @Date 2020/4/29 16:18
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        List<College> list = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        list.add(computerCollege);
        list.add(infoCollege);

        OutPut outPut = new OutPut(list);
        outPut.printC();
    }
}

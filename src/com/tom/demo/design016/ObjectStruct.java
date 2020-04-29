package com.tom.demo.design016;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZX
 * @Date 2020/4/29 12:24
 * @Version 1.0
 */
public class ObjectStruct {
    private List<Person> list = new ArrayList<>();

    public void addPerson(Person person) {
        list.add(person);
    }

    public void removePerson(Person person) {
        list.remove(person);
    }

    public void display(Action action) {
        for (Person person : list) {
            person.accept(action);
        }
    }
}

package com.tom.demo.design05;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZX
 * @Date 2020/4/19 21:24
 * @Version 1.0
 */
public class Person implements Cloneable, Serializable {
    private String name;
    private int age;
    private List<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    //深克隆第一种模式
    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        List<String> newList = new ArrayList<>();
        for (String str : list) {
            newList.add(str);
        }
        person.setList(newList);
        return person;
    }

    //深克隆第二种流模式
    public Person deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//将当前对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Person p = (Person) ois.readObject();
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

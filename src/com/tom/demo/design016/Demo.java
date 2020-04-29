package com.tom.demo.design016;

/**
 * @Author ZX
 * @Date 2020/4/29 12:45
 * @Version 1.0
 */
public class Demo {
   //static   int[] a;
   // static String name;
    public static void main(String[] args) {
        ObjectStruct os = new ObjectStruct();
        Person person1 = new Man();
        Person person2 = new Woman();

        Action success = new Success();
        Action fall = new Fall();

        os.addPerson(person1);
        os.addPerson(person2);

        os.display(success);
        System.out.println("============");
        os.display(fall);


    //    a[0]=1;   //java.lang.NullPointerException
   //     System.out.println(a);
   //     name="tom";   没毛病
   //     System.out.println(name);
    }
}

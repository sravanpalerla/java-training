package org.oops;

public class Student {
    public static void main(String[] args) {
        Obj s1=new Obj();
        s1.age=121;
        s1.name="sravam";
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println("****");
        Obj s2=new Obj();
        s2.age=90;
        System.out.println(s2.age);
        s2.age=s2.age+7;
        System.out.println(s2.age);


    }
}

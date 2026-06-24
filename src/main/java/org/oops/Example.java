package org.oops;
public class Example {
    int a = 12;
    int b = 123;
    String s="sravan";
    public static void main(String[] args) {
        Example s1 = new Example();
        Example s2 = new Example();
        Example s3=new Example();
        System.out.println(s3.s);
        System.out.println(s1.a);
        System.out.println(s2.b);
        System.out.println(s1==s2);
    }
}

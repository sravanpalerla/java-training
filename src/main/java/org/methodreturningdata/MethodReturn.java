package org.methodreturningdata;

public class MethodReturn {
    public static void main(String[] args) {
        int c=add();
        System.out.println(c);

    }
    public static int add(){
        int a=10;
        int b=30;
        return a+b;
    }
}

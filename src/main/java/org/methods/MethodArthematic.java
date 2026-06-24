package org.methods;

public class MethodArthematic {
    public static void main(String[] args) {
        add();
        sub();
        name();
    }

    public static void add() {
        int a = 10;
        int b = 10;
        System.out.println("addition  " + (a + b));
    }

    public static void sub() {
        int a = 19;
        int b = 12;
        System.out.println("sub   " + (a - b));
    }

    public static void name() {
        String name = "sarvan";
        System.out.println(name);
    }
}

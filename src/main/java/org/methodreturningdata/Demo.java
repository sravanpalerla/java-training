package org.methodreturningdata;

public class Demo {
    public static void main(String[] args) {
            int c=add(12,45);
        System.out.println(c);
        int s=sub(12,6);
        System.out.println(s);

        }

        public static int add(int a, int b) {
            return a+b;
        }

        public static int sub(int a, int b) {
            return a-b;
        }
    }

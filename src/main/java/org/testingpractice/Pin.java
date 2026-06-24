package org.testingpractice;

import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("security pin");
        int a = 1234;
        System.out.println("enter withdraw pin");
        if (a == s.nextInt()) {
            System.out.println("matched");
        }
         else {
            System.out.println("invalid pin");

//        int n = 3;
//        while (n > 0) {
//            Scanner s1 = new Scanner(System.in);
//            System.out.println("please enter Pin number");
//            if (s1.nextInt() == a) {
//                System.out.println("matched");
//                break;
//            } else {
//                System.out.println("not matched please try again");
//                n--;
//            }
//        }
//        if(n==0){
//            System.out.println("your card is blocked");
//        }
        }
    }
}



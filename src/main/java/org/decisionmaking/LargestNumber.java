package org.decisionmaking;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("eneter a number");
        int a = s.nextInt();
        System.out.println("enter number 2");
        int b = s.nextInt();
        System.out.println("enter number 3");
        int c = s.nextInt();
        if (a > b) {
            System.out.println("largest="+a);
        } else if (a > c && b > a) {
            System.out.println("largest="+b);
        } else if (c > a) {
            System.out.println("largest="+c);
        } else {
            System.out.println("default");
    }

    }
}

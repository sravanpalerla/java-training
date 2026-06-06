package org.dynamicread;
import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=s.nextInt();
        System.out.println("enter num2");
        int num2=s.nextInt();
        System.out.print(num1+num2);

    }
}

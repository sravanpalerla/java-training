package org.decisionmaking;
import java.util.Scanner;
public class AllowSchorlar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int percentage=s.nextInt();
        int marks=s.nextInt();
        if(percentage>75&&marks>60) {
            System.out.println("eligible for scholar");
        }
        else{
            System.out.println("go to home");
        }

    }
}

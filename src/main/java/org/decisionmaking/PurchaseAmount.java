package org.decisionmaking;

import java.util.Scanner;
public class PurchaseAmount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter purchase amount");
        int a=s.nextInt();
        if(a>1000) {
            System.out.println("free delivery");
            System.out.println("total amount: " +a);
        }
        else{
            System.out.println("Deliver charge = 100");
            System.out.println("total charge: "+(a+100));

        }
    }

}

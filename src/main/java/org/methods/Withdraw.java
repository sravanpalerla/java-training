package org.methods;
import javax.swing.*;
import java.util.Scanner;
public class Withdraw {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount");
        int balance=s.nextInt();
        int withdw=s.nextInt();
        amount(balance, withdw);
    }

    public static void amount(int balance,int withdw){
        if(balance>=withdw) {
            int rem=balance-=withdw;
            System.out.println("withdraw is successfull");
            System.out.println("remaining balance is "+rem);
        }
        else {
            System.out.println("insuffient");
        }
    }
}

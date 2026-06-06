package org.decisionmaking;
import java.util.Scanner;
public class Balances {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("amount enter");
        int amount=s.nextInt();
        int balances=s.nextInt();
        if(amount<balances) {
            System.out.println("sucessfful");
        }
        else{
            System.out.println("insuufiecint");
        }
    }
}

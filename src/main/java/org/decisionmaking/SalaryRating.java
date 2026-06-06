package org.decisionmaking;
import java.util.Scanner;
public class SalaryRating {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter");
        int salary=s.nextInt();
        int rate=s.nextInt();
        if(rate>=5){

            System.out.println("yrs");
            System.out.println("increment: "+(rate+20));
        }
        else{
            System.out.println("no");
            System.out.println("increment: "+(rate+10));
        }


    }
}
package org.testingpractice;
import java.util.Scanner;
public class DiVisible {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        for(int i=1;i<=25;i++){
            System.out.println("enter numbers");
            int num=s.nextInt();
            if(num%2==0&&num%5==0) {
                System.out.println("divisible");
            }
            else {
                System.out.println("not divisible");
            }
        }
    }
}

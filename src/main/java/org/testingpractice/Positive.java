package org.testingpractice;
import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("enter numbers");
            int n=s.nextInt();
            if(n>0){
                System.out.println("positive");
            }
            else{
                System.out.println("negative");
            }
            System.out.println(n);
        }
    }
}





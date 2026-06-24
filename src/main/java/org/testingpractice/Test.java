package org.testingpractice;
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c;
        do {

            System.out.println("welcome");
            System.out.println("do you want to print");
            c=s.next().charAt(0);
        }
        while(c=='y'||c=='Y');
        {

        }
    }
}

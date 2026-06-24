package org.testingpractice;
import java.util.Scanner;
public class SumEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enetre numers");
        int n=s.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++) {
            int num=s.nextInt();
            if (num% 2 == 0) {
            }
            sum = sum+num;
        }
        System.out.println(sum);

    }
}
package org.testingpractice;
import java.util.Scanner;
public class EligibleVote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter age " + i + ": ");
            int age = s.nextInt();

            if (age >= 18) {
                count++;
            }
        }

        System.out.println("Number of eligible voters = " + count);
    }
}
package org.testingpractice;
import java.util.Scanner;
public class EmployeSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println("enter salresis");
            int salary = s.nextInt();
            if (salary <= 20000) {
                System.out.println("low salary");
            } else if (salary >= 20000 && salary <= 50000) {
                System.out.println("mediom");
            } else if (salary >= 50000) {
                System.out.println("high salarry");
            }
        }
    }
}

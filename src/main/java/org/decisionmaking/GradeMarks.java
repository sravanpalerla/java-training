package org.decisionmaking;
import java.util.Scanner;
public class GradeMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int a = s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if (a > 90) {
            System.out.println("A grade");
        }
        else if (b > 75) {
            System.out.println("b grade");
        } else if (c > 65) {
            System.out.println("c grade");
        } else {
            System.out.println("fail");
        }
    }
}

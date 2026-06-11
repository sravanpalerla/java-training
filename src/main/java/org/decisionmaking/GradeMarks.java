package org.decisionmaking;
public class GradeMarks {
    public static void main(String[] args){
        int a=85;
        int b=76;
        int c=45;
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

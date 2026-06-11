package org.decisionmaking;

public class ECommerce {
    public static void main(String[] args) {
        int a = 1200;
        if (a >= 10000) {
            System.out.println("discount  "+ (20));
        } else if (a >= 5000) {
            System.out.println("discount "+(10));
        } else if (a >= 2000) {
            System.out.println("discount "+ (5
            ));
        } else {
            System.out.println("no discount");

        }
    }
}

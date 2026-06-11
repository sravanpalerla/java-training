package org.decisionmaking;

public class TrafficSpeedLimit {
    public static void main(String[] args) {
        int speed = 140;
        if (speed >= 120) {
            System.out.println("fine " + (5000));
        } else if (speed >= 100) {
            System.out.println("fine " + (3000));
        } else if (speed >= 80) {
            System.out.println("fine " + (1000));
        } else {
            System.out.println("no fine");
        }
    }
}

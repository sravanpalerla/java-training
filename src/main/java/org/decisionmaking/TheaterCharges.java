package org.decisionmaking;

public class TheaterCharges {
    public static void main(String[] args) {
        int age=65;
        if(age<=12) {
            System.out.println("charge childrens  " + (100));
        }
            else if(age>=12&&age<=56){
                System.out.println("charge adult "+(200));
            } else if (age>=60) {
                System.out.println("charge for snior citizen  "+(150));

            }
        }
    }

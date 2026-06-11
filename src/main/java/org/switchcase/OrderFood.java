package org.switchcase;

public class OrderFood {
    public static void main(String[] args) {
        int order = 2;
        switch(order) {
            case 1:
                System.out.println("order sandwitch");
                break;
            case 2:
                System.out.println("order burger");
                break;
            case 3:
                System.out.println("order frenchfires");
            case 4:
                System.out.println("order sanwitch");
                break;
            default:
                System.out.println("invalid choice");
        }
    }
    }

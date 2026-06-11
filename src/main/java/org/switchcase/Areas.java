package org.switchcase;

public class Areas {
    public static void main(String[] args) {
        int choice = 1; // 1-Circle, 2-Rectangle, 3-Square

                switch (choice) {
                    case 1:
                        double radius = 5;
                        double circleArea = 3.14 * radius * radius;
                        System.out.println("Area of Circle = " + circleArea);
                        break;

                    case 2:
                        int length = 10;
                        int breadth = 5;
                        System.out.println("Area of Rectangle = " + (length * breadth));
                        break;

                    case 3:
                        int side = 4;
                        System.out.println("Area of Square = " + (side * side));
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }


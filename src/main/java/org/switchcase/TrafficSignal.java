package org.switchcase;

public class TrafficSignal {
    public static void main(String[] args) {
        int color='r';
        switch (color){
            case 'g':
                System.out.println("ready");
                break;
            case 'y':
                System.out.println("proced");
                break;
            case 'r':
                System.out.println("stop");
                break;
            default:
                System.out.println("invallid grade");
        }
    }
}

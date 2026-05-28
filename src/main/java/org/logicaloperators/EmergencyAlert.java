package org.logicaloperators;

public class EmergencyAlert {
    public static void main(String[] args) {
        int heartbeat=90;
        int oxygenlevel=95;
        boolean b=(heartbeat<=95||oxygenlevel>=97);
        System.out.println(b);
    }
}

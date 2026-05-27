package org.logicalprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        String s = "12345678";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }
}


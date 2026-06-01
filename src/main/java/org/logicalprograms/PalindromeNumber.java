package org.logicalprograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int a = 131,
       rev = 0,
        temp = a;
        while (temp> 0) {
            rev = rev * 10 + temp % 10;
            temp/= 10;
        }
        System.out.print(a == rev);
    }
}


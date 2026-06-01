package org.logicalprograms;

public class PrimeNumber{
        public static void main(String[] args) {
            int n = 50;
            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            System.out.println(count == 2 ? "Prime Number" : "Not Prime Number");
        }
    }


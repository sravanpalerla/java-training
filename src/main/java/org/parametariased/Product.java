package org.parametariased;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("eneter product prices");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        product(a,b,c);
    }
    public static void product(int a,int b,int c){
        if(a>=20000) {
            System.out.println("10 % dicscount for above 20000 "+ (a));
        } else if (b>=20000) {
            System.out.println("10 % dicscount  for above 20000  "+ (b));
        } else if (c>=20000) {
            System.out.println("10 % dicscount  for above 20000  "+ (c));
        }
        else {
            System.out.println("no discount");
        }

    }
    }

package org.typecasting;

public class Widening {
    public static void main(String[] args) {
        /*byte b=120;
        int i=b;
        System.out.println(i);
    }*/
/*int x=120;
double d=x;
System.out.println(d);
}
        }*/
        /*char c = 'a';
        int i = c;
        System.out.println(i);
        double d = i;
        System.out.println(d);
    }
}*/
        ////narrowing ==covert larger to data using casttype operator//
       /* double d = 127.6;
        int i = (int) d;//int type casting//
        System.out.print(i);
    }
}*/
        int i = 129;
        byte b= (byte) i;
        System.out.print(b);
    }
}

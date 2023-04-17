package day05_incrementDecrement_Concatenation;

public class C02_Preincrement_Postincrement {

    public static void main(String[] args) {

     /*
        If we are trying to decrease or increase value by one we can use ++ or -- symbols

        If these ++ or -- symbols are in frond of the variable ( ex: ++a), and If we are trying to do two different
        actions at the same time, we need to complete increment first, then we will do the second part

        If these ++ or -- symbols are after the variable ( ex: a++ ), and if we are trying to do two different things
        at the same time, we need to complete the action first then we will increase the value;

         */

        int a = 20;

        a++;  // increases the value by one

        System.out.println("a : "+a);     // 21

        a = 20;

        ++a;  // increases the value by one

        System.out.println("a : "+a);     // 21

        a =20;
        a--;

        System.out.println("a : "+a);    // 19

        System.out.println(".................");

        a = 20;

        System.out.println(++a);        // 21

        a = 20;

        System.out.println(a++);        // 20  //IMPORTANT!! SEE THE DIFFERENCE BETWEEN THE RESULTS OF LINE 39 AND 43

        System.out.println("a : "+a);   // a : 21

        System.out.println(".............");

        a = 20;

        int b = a++;

        System.out.println("a : "+a +", b : "+b);   // a : 21, b : 20

        System.out.println("...........");

        a = 20;

        b = ++a;

        System.out.println("a : "+a +", b : "+b);   // a : 21, b : 21
                                                    // SEE THE DIFFERENCE BETWEEN THE RESULTS OF 53. and 61. LINES!!!
                                                    // WHEN ++ OR -- IS BEFORE INT, IT AFFECTS +-1 OF THE VALUE OF b

        System.out.println("--------------");

        a = 20;
        b = a--;

        System.out.println("a : "+a +", b : "+b);   // a : 19, b : 20

        a = 20;
        b = --a;

        System.out.println("a : "+a +", b : "+b);   // a : 19, b : 19
                                                    // DIFFERENCE BETWEEN 70 AND 75 ARE SAME AS BETWEEN 53 AND 61

        System.out.println("--------------");

        a = 20;
        b= 10 ;
        int c = 30;

        System.out.println(++c);    // 31  t
        System.out.println(a++);    // 20  t
        c= b++;
        System.out.println(c);      // 10  t
        System.out.println(--a);    // 19  f    // 20 new value of a should be acc to 21 via the second function of a in 88!!!! 85 and 88 functions together
        System.out.println(--a);    // 18  f    // 19
        System.out.println(a);      // 18  f    // 19

        System.out.println("--------------");

        a = 20;

        System.out.println(a++);  // 20  cor
        System.out.println(--a);  // 20  cor
        System.out.println(--a);  // 19  cor
        System.out.println(a);    // 19  cor















    }







}

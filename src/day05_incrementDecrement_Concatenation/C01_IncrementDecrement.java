package day05_incrementDecrement_Concatenation;

public class C01_IncrementDecrement {

    public static void main(String[] args) {

     int a = 20;

     // increase the value of a by 3; and assign it to b, then print the b

     a = a + 3; // a += 3; // a++, a++, a++

     int b = a;

        System.out.println("a : " + a+ ", b : " + b); // a : 23, b : 23

     // assign a to b, then increase the value of a by 3, then print

        a = 20;

        b = a;

        a += 3;

        System.out.println("a : "+ a+ ", b :"+ b); // a : 23, b :20
                                                   // IMPORTANT !!!!! THE LINE MATTERS. WE ASSIGNED a to b
                                                   // BEFORE INCREASING a.

        System.out.println("..............................");

        a = 20;

        System.out.println("a : "+a);  // 20

        a += 5;

        System.out.println("a : "+a);  // 25      // Java functions from top to bottom and left to right
                                                  // SO LINE MATTERS !!!!

        // decrease the value of a by 2, then print it

        a = 20;
        a -= 2;

        System.out.println("a : "+ a);  // 18

        System.out.println("..............................");

         a = 10;

        System.out.println("value of a : "+ a);  // 10

        b = a++;

        System.out.println("value of b : "+ b);  // 10 correct

        int c = b++ +a;

        System.out.println("value of c : "+ c);  // 21  correct

        System.out.println("summation : "+ (a+b+c));    // 42  wrong    result is 43






    }




}

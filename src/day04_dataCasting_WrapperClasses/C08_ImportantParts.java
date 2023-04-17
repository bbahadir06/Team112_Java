package day04_dataCasting_WrapperClasses;

public class C08_ImportantParts {

    public static void main(String[] args) {

    int a = 20;
    int b = 6;

    System.out.println(a/b); // result is integer (3) as the coding was done with integers.

    double c = 20;
    System.out.println(c/b); // result is 3.3333333333333335. if we use a double in a calculation, result will also
                                 // be calculated in double data type.

     float d = 20f;
        System.out.println(d/b); // result is 3.3333333

        System.out.println((double) (a/b)); // 3.0. when we try to divide an int, result will be an int. so, if we try
                                            // to cast this int to a double, still double will not have decimal units.

        // however:

        System.out.println((double) a/b);  // 3.3333333333333335.
        System.out.println(a/(double) b);  // 3.3333333333333335.
                                           // if we want to have a double result from integers, we need to cast one of
                                           // the int to double.


        int num = 12;
         num  = num+5;
        System.out.println(num);   // 17

        System.out.println("......................");


        int number = 1467;
        System.out.println(number);  // 1467

        System.out.println(number = number/10);  //  146

        System.out.println(number = number/10);  // 14

        System.out.println(number = number/10);  // 1










    }





}

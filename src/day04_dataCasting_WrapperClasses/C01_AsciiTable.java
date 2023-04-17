package day04_dataCasting_WrapperClasses;

public class C01_AsciiTable {

    public static void main(String[] args) {

        /*

        24 ==> 11000
        a ===> 97 ===> 10100010 in binary system
        b ===> 98
        c ===> 99


         */

        // when we assign a number to a char variable, actually we are using the ASCII TABLE

        System.out.println(5 + 'a');  // // the result is 102 //  when we use single quotes, it means a char
        // WHEN A CHAR SEES A MATH CALCULATION (here (+)), IT CANNOT RESIST AND
        // IT WİLL ACT AS A NUMBER

        char chr = 99;
        System.out.println(chr);  // the result is c

        // to get the next char

        char chr2 = 'b';
        System.out.println(chr2+1);  //99 as it cannot resist to math calc.

        // but when we add (char) in the braces, we get
        System.out.println((char)(chr2+1));  // we get c

        // and if we don't use the brace as in the following one
        System.out.println((char)chr2+1); // the result is 99 again as the char that we added does not have any function
        // without brace

        // so
        System.out.println(chr2+1); // 99
        System.out.println((char)(chr2+1)); // c
        System.out.println((char)chr2+1); // 99


        // when we want to see the previous character:

        char chr4 = 'f';

        System.out.println((char)(chr4-1)); // e
        System.out.println((char)(chr4-2)); // d















    }
}

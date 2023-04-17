package day08_NestedIfElse_Ternary_SwtichStatements;

import java.util.Scanner;

public class C10_NestedTernary_ {
    public static void main(String[] args) {

   /*
        take an int number from user
        if it is positive, check if it is an even number
        if it is not a positive number, check if it has 3 digits
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a number");                // Slide 87
        int number = scan.nextInt();

        System.out.println(number > 0 ?
                number % 2 == 0 ? "even" : "not even" :
                number > -1000 && number < -99 ? "3 digits" : "no 3 digits");















    }
}

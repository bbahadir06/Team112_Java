package day04_dataCasting_WrapperClasses;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class C06_Question5 {

    public static void main(String[] args) {

    // 5- Get a double and an integer from the user, divide the double number by the second number
    //    and print the integer part of the result of the division operation.

        Scanner scan = new Scanner (System.in);

        System.out.println("Please enter a double number :");
        double number1 = scan.nextDouble();

        System.out.println("Please enter an integer number :");
        int number2 = scan.nextInt();

        int result = (int) number1/number2; // when we want to use a double/int or double * int, etc. we should add
                                            // (int) (146241) as seen in the 21st line
        System.out.println(result); // 154  then we get an int result without any decimals.
















    }







}

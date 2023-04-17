package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C05_Question4 {

    public static void main(String[] args) {

    // 4- Take two double numbers from the user, divide the first number by the second number and print the integer part
    //    of the result of the division operation.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a double number");  // 2427,5647
        double num1 = scan.nextDouble();

        System.out.println("Please enter another double number"); // 387,2145
        double num2 = scan.nextDouble();

        double result = num1/num2;

        System.out.println(result); // 6.269302156814892

        // however, we have to get an integer result. this means that there should be no decimals, then we do:

        int resultInt = (int) result; // we have to write (int) in the second part of the equation to be able to install
                                      // double input as it is bigger than int.
                                      // the result is 6 now instead of 6.269302156814892. then we have no decimals now with
                                      // int
        System.out.println(resultInt);

















    }











}

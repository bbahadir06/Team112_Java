package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C09_Question_sumOfDigits {


    public static void main(String[] args) {

     // Take a positive 4-digit integer from the user and find the sum of the digits.

     // 1469


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 4-digit integer");

        int number = scan.nextInt();

        int sum = 0;

        sum = sum + number % 10;
        number = number / 10;           // we get the last one  1 here  (in 5281 sample)

        sum = sum + number % 10;
        number = number / 10;           // 3rd digit        8

        sum = sum + number % 10;
        number = number / 10;           // 2nd              2

        sum = sum + number % 10;        // 1st              5

        System.out.println("sum of digits : " + sum);

        // we don't write number = number / 10
        // under the last sum = ......... part

        // ctrl +alt + l  // to make everything tidy














    }









}

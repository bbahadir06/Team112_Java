package Day14_MethodOverloading_whileLoopImportant_in_job;

import java.util.Scanner;

public class C02_PrimeNumber {
    public static void main(String[] args) {

        // check a given number, if it is a prime number print it is a prime number

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        isPrimeNumberMethod(number);
    }
    public static void isPrimeNumberMethod ( int number) {

        int flag =0;                            // in the method
        for (int i = 2; i <number ; i++) {
            if (number % i ==0){
                flag++;
            }
        }
        if (flag!=0){
            System.out.println(number+ " is not  prime number");
        }else {
            System.out.println("yes " +number+" is  prime number");
        }


    }
}

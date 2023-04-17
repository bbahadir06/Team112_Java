package Day15_While_doWhileLoop_Scope;

import java.util.Scanner;

public class C07_DoWhileLoop_sumOfDigits {


    // to calculate sum of numbers, take numbers from the user
    // and tell user to press 0 to end the app
    // when user presses 0 code should print the sum of numbers

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = 0;

        int sum = 0;

        do {

            System.out.println("Please enter a number");
            number = scan.nextInt();

            sum += number;  // sum = sum + number

            } while (number!=0);     // as long as user does not enter 0, loop will continue

        System.out.println("sum of the numbers is " + sum);



    }
}
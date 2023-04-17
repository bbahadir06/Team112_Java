package Day15_While_doWhileLoop_Scope;

import java.util.Scanner;

public class C08_WhileLoop_same_Q_with_C07 {

    public static void main(String[] args) {

        // to calculate sum of numbers, take numbers from the user
        // and tell user to press 0 to end the app
        // when user presses 0 code should print the sum of numbers

        Scanner scan = new Scanner (System.in);

        int number = 1;

        int sum = 0;

        while (number!=0) {

            System.out.println("Please enter a number");

            number = scan.nextInt();

            sum += number;

        }
        System.out.println(sum);




    }
}

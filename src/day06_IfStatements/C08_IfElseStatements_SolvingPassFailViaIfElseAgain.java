package day06_IfStatements;

import java.util.Scanner;

public class C08_IfElseStatements_SolvingPassFailViaIfElseAgain {

    public static void main(String[] args) {

     // Question 2-Get a note from the user, print "Passed the Class" if it is 50 or more,
                // and "Sorry, failed" if it is less than 50.


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");

        int grade = scan.nextInt();

        if (grade>=50) {

            System.out.println("Passed the class");
        } else {
            System.out.println("Sorry, failed");
        }



















    }



}

package day06_IfStatements;

import java.util.Scanner;

public class C06_IfStatements_Q5_PassFail {

    public static void main(String[] args) {

        //Question 5- Get a note from the user.
        // If it is 50 or more, print “Passed the Class”,
        // if it is less than 50, “Sorry, Failed”.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a grade");

        int grade = scan.nextInt();

        if (grade>=50) {
            System.out.println("Passed the class");
        }


        if (grade<50) {
            System.out.println("Sorry, failed");
}



            }


}
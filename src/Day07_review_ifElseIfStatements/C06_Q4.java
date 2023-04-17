package Day07_review_ifElseIfStatements;

import java.util.Scanner;

public class C06_Q4 {

    public static void main(String[] args) {

        // Question 4- Get the distance from the user in kilometers and ask the unit he wants to convert to, if
        //the unit he wants is meters or centimeters, convert and print it, otherwise print "the unit
        //you want is not registered to the system".

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the distance as km");
        int numberOfKm = scan.nextInt();

        System.out.println("Please enter 1 if you want to convert it to meters, please enter 0 if you don't want");
        int convert = scan.nextInt();




        if (convert == 1) {
            System.out.println("meters: " + numberOfKm * 1000);
        } else if (convert == 1) {
            System.out.println(" centimeters: " + numberOfKm * 100000);
        } else if (convert == 0) {
            System.out.println("the unit you want is not registered to the system");
        }





    }
}

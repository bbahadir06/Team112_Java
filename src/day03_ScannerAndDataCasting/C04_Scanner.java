package day03_ScannerAndDataCasting;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

//Question 4- Take the length of 2 sides of a rectangle from the user and print the area of the rectangle

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first side of the rectangle");
        double firstSide = scan.nextDouble();

        System.out.println("Please enter the second side of the rectangle");
        double secondSide = scan.nextDouble();

        System.out.println("The area of the rectangle is : " + firstSide  * secondSide);

  // or we can do in the following way also:

        double areaOfRec = firstSide*secondSide;
        System.out.println("The area of the rectangle is : " + areaOfRec);















    }




}

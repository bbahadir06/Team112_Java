package day03_ScannerAndDataCasting;

import java.util.Scanner;

public class c06_Scanner {

    public static void main(String[] args) {
         // take the radius of a circle from the user and print its perimeter and area.


        Scanner scan = new Scanner (System.in);

        System.out.println("Please enter radius of the circle");
        double radius = scan.nextInt();

        double  perimeterOfCircle = 2*radius*3.14;

        System.out.println("The perimeter of circle : " + perimeterOfCircle);

        double areaOfCircle = 3.14*radius*radius;
        System.out.println("The area of circle is : " + areaOfCircle);












    }





}

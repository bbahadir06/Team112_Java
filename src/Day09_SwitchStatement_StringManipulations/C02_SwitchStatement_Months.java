package Day09_SwitchStatement_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatement_Months {

    public static void main(String[] args) {

        //Question 3- Get the month number from the user and print the month name


            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number");
            int monthNumber = scan.nextInt();
            // organiser and case selecters should have same data types.

            switch (monthNumber) {
                case 1 :
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3 :
                    System.out.println("March");
                    break;
                case 4 :
                    System.out.println("April");
                    break;
                case 5 :
                    System.out.println("May");
                    break;
                case 6 :
                    System.out.println("June");
                    break;
                case 7 :
                    System.out.println("July");
                    break;
                case 8 :
                    System.out.println("August");
                    break;
                case 9 :
                    System.out.println("September");
                    break;
                case 10 :
                    System.out.println("October");
                    break;
                case 11 :
                    System.out.println("November");
                    break;
                case 12 :
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Incorrect month number is entered");
            }













    }









}

package day06_IfStatements;

import java.util.Scanner;

public class C12_IfStatements_Q2_Slide71 {
    public static void main(String[] args) {

     // Get a letter from the user, print it if there is a month that starts with a letter.
     // NOTE: No uppercase or lowercase sensitivity. When the user types j or J, output is Jan.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char chr = scan.next().charAt(0);

        if (chr == 'j'|| chr == 'J') {
            System.out.println("Jan");
        }

        if (chr == 'f'|| chr == 'F') {
            System.out.println("Feb");
        }

        if (chr == 'm'|| chr == 'M') {
            System.out.println("March");
        }

        if (chr == 'a'|| chr == 'A') {
            System.out.println("April");
        }







    }
}

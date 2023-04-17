package day06_IfStatements;

import java.util.Scanner;

public class C010_IfElse_charAt {

    public static void main(String[] args) {

        //Question 4- Ask the user to enter a character,
        // print whether the entered character is uppercase or not.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Capital letter");
        char chr = scan.next().charAt(0);

        if (chr>=65 && chr<=97) {
            System.out.println("Yes, it is a capital letter");
        } else {
            System.out.println("It is something else");
        }









    }
}

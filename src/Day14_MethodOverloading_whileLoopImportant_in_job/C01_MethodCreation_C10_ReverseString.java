package Day14_MethodOverloading_whileLoopImportant_in_job;

import Day13_nestedLoops_methodCreation.C10_reverseString;

import java.util.Scanner;

public class C01_MethodCreation_C10_ReverseString {

    // use the method from day13 to reverse strings and check if it is a palindrome (madam)
    // take a string from user and check if it is a palindrome

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();

        String reversedStr = C10_reverseString.reverseString(str);
        if (str.equals(reversedStr)) {
            System.out.println("Yes they are palindrome");
        } else {
            System.out.println("they are not palindrome");


        }
    }
}

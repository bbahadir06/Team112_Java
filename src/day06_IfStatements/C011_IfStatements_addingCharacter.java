package day06_IfStatements;

import java.util.Scanner;

public class C011_IfStatements_addingCharacter {

    public static void main(String[] args) {

        // Question 5- Ask the user for a letter,
        // if the entered character is lowercase (97-122), print it in uppercase,
        // otherwise print the entered letter

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a lowercase");
        char chr = scan.next().charAt(0);

        if (chr>= 'a' && chr<= 'z') {   // instead of using numbers we can use characters directly
            System.out.println(Character.toUpperCase(chr));
            } else {
            System.out.println(chr);
        }

        System.out.println();











    }


}

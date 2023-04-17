package day04_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C03_Question2_charAtAndLining {

    public static void main(String[] args) {

     // Question 2- Take a letter  from the user and print the next 3 letters from the alphabet.

     Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a letter");

        char letter = scan.next().charAt(0); // as there is not a more character in char, we add charAt() after scan.next().
                                             // a ==> 97

        System.out.println("user entered : " + letter +"\nnext letter : "+ letter+1); // d and d1

        // to avoid from the above results we should add (char)

        System.out.println("user entered : " + letter +"\nnext letter : "+ (char) (letter+1)); // d and e //dif bet 18 and 22

        System.out.println("user entered : " + letter +  // d
                "\nnext letter : "+ (char) (letter+1)+   // e
                "\nnext letter : "+ (char) (letter+2)+   // f
                "\nnext letter : "+ (char) (letter+3));  // g
                                                         // these are also valid for the capitals, but after x, the other signs take place


















    }











}

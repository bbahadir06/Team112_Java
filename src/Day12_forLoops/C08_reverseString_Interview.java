package Day12_forLoops;

import java.util.Scanner;

public class C08_reverseString_Interview {
    public static void main(String[] args) {

        //Question 9 (interview)- Ask the user for a String and print the String in reverse.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();

        int startingNumber = str.length()-1;

        String outputStr ="";

        for (int i = startingNumber; i >=0 ; i--) {  // when we take the last number we should add this to output
            outputStr = outputStr + str.charAt(i);
        }
        System.out.println(outputStr);







    }
}

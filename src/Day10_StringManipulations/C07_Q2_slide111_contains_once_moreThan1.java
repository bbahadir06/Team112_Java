package Day10_StringManipulations;

import java.util.Scanner;

public class C07_Q2_slide111_contains_once_moreThan1 {
    public static void main(String[] args) {

        //Question 2: Get a String from the user and the text to be searched.
        //Check the usage of the desired text in the String and print the appropriate one of the following sentences.
        //String does not contain the searched text
        //Searched text used only once in the String
        //Searched text used more than 1 in the String

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String to be searched");
        String str1=scan.nextLine();

        System.out.println("Please enter a desired text");
        String str2 = scan.next();

        if (str1.indexOf(str2)==(-1)){
            System.out.println("str1 does not contain str2");
        } else {
            int indexOfWord = str1.indexOf(str2);
            if (str1.indexOf(str2,(indexOfWord+1))==(-1)){
                System.out.println("There is only one desired word in first String");
            }else {
                System.out.println("There are more than one desired words in first String");
            }
        }













    }

}

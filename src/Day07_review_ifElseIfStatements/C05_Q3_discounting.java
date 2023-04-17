package Day07_review_ifElseIfStatements;

import java.util.Scanner;

public class C05_Q3_discounting {
    public static void main(String[] args) {

        // Question 3- Get the number of products purchased from the user and the list price, and ask the
        //user if they have a customer card. If the customer has a card and buys more than 10 items,
        //20% off, otherwise 15% off.
        //If the customer does not have a card, 15% off if he buys more than 10 products, 10% off
        //if he does not

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of products");
        int numberOfPro = scan.nextInt();

        System.out.println("Please enter list price");
        int listPrice = scan.nextInt();

        // we write in this way (sout) as boolean makes the coding difficult
        System.out.println("Please enter 1 if you have a card, if you don't have please enter 0");
        int haveCard = scan.nextInt();

        if (haveCard == 1 && numberOfPro >= 10) {
            System.out.println("with 20% discount with card, number >= 10 : " + numberOfPro * listPrice * 0.8);
        } else if (haveCard == 1 && numberOfPro < 10) {
            System.out.println("with 15% discount with card, number < 10 : " + numberOfPro * listPrice * 0.85);
        } else if (haveCard == 0 && numberOfPro >= 10) {
            System.out.println("with 15% discount without card, number > 10 : " + numberOfPro * listPrice * 0.85);
        } else  {
            System.out.println("with 10% discount without card, number < 10: " + numberOfPro * listPrice * 0.9);
        }

        // no change if we don't write if and condition in the last else. it does the coding
        // if (haveCard ==0 && numberOfPro < 10) writing this or not does not affect functioning of java




    }
}

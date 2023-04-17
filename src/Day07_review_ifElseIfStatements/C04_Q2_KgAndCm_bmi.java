package Day07_review_ifElseIfStatements;

import java.util.Scanner;

public class C04_Q2_KgAndCm_bmi {
    public static void main(String[] args) {

        // Ask for the user's weight (kg) and height (cm) and calculate the body mass index
        //(weight * 10000 / (height * height)) if the body mass index is greater than 30 obese,
        //between 25-30 overweight, between 20-25 normal, if less than 20 print thin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your weight as kg");
        int kg = scan.nextInt();

        System.out.println("Please enter your height as cm");
        int cm = scan.nextInt();

        int bmi = (kg * 10000) / (cm * cm);

        if (bmi > 30) {
            System.out.println("obese");
        } else if (bmi> 25) {
            System.out.println("overweight");
        } else if (bmi >20) {
            System.out.println("normal");
        } else  {                            // we don't write if and the condition in the last else!!!!!!
            System.out.println("thin");
        }

    }

}

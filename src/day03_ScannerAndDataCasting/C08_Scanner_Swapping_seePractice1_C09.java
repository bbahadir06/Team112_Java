package day03_ScannerAndDataCasting;

public class C08_Scanner_Swapping_seePractice1_C09 {

    public static void main(String[] args) {

    // take two numbers from the user and swap the values of both without using a third variable.

        int no1, no2;
        no1 = 10;
        no2 = 20;

        // print values before swapping
        System.out.println("Before swapping - no1: "+ no1 +", no2: " + no2);

        // swap numbers
        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;

        // print values after swapping
        System.out.println("After swapping - no1: "+ no1 +", no2: " + no2);
















    }
}

package Day12_forLoops;

import java.util.Scanner;

public class C06_forLoops_factoriel {
    public static void main(String[] args) {

        //Question 5- Take a number less than 20 from the user and calculate the factorial value of this number.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");

        int number = scan.nextInt();


        int factoriel = 1;



        for (int i = number; i >=1 ; i--) {
            factoriel = factoriel * i;
        } if (number<=20 && number>=1)

        System.out.println(factoriel);

        else {
            System.out.println("Invalid value");
        }





    }
}

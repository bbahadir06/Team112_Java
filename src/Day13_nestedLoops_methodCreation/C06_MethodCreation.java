package Day13_nestedLoops_methodCreation;

import java.util.Scanner;

public class C06_MethodCreation {
    public static void main(String[] args) {

        add(); // as we made 3 adds, in the run section, 3 times add operations were done
        add();
        add();




    }


    public static void add() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pleae enter a number");
        int firstNumber = scan.nextInt();

        System.out.println("Please enter second number");
        int secondNumber = scan.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println(result);
        System.out.println("End of the calculation");
    }











}

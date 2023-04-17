package Day07_review_ifElseIfStatements;

import java.util.Scanner;

public class C06_06forQ4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the distance in km");
        double km = scan.nextDouble();
        System.out.println("Please enter Meter or Centimeter");
        char Unit = scan.next().charAt(0);
        double unitM = (km * 1000);
        double unitC = (km * 100000);
        if (Unit == 'M' || Unit == 'm') {
            System.out.println(unitM);
        } else if (Unit == 'C' || Unit == 'c') {
            System.out.println(unitC);
        } else {
            System.out.println("The unit you want is not registered to the system");
        }













    }
}

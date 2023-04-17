package Day20_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_takeNamesFromUserMethod {
    public static void main(String[] args) {

        // create a method
        // to take names from user and create a list from them

        System.out.println(creatingListFromUser());

    }

    public static List<String> creatingListFromUser() {

        // we create variables outside the loop

        Scanner scan = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String enteredName = "";

        while (!enteredName.equalsIgnoreCase("q")) {     //  as long as enteredName is not Q, loop will continue

            System.out.println("Please enter a name to add the list and to finish press Q");

            enteredName = scan.next();

            if (!enteredName.equalsIgnoreCase("q")) {

                names.add(enteredName);

            }
        }
        return names;

    }
}
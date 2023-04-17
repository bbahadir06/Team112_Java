package Day20_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_CallingMethodFromAnotherClass {

    public static void main(String[] args) {

        List<String> products = new ArrayList<>();

        products.add("Nutella");
        products.add("Barbie");
        products.add("Toy Car");
        products.add("Margaretta");
        products.add("Nestle");
        products.add("Candy");

        String unWantedLetter = "e";

        System.out.println(products);  // it gives all the products above without considering line 19

    }
}

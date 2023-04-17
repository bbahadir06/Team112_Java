package Day20_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05A_CallingMethodFromAnotherClass {
    public static void main(String[] args) {

        // let's use deleteNamesWhichContainsUnwantedLetter method from C04 Class

        List<String> products = new ArrayList<>();

        products.add("Nutella");
        products.add("Barbie");
        products.add("Toy Car");
        products.add("Margaretta");
        products.add("Nestle");
        products.add("Candy");

        String unWantedLetter = "N";

        System.out.println(C04_RemoveUnWanted.deleteNamesWhichContainsUnwantedLetter(products, unWantedLetter)); // wrote all the products




    }
}

package Day20_ArrayLists;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C01_Equals {
    public static void main(String[] args) {

        List<Integer> numbers1 = new ArrayList<>();

        numbers1.add(3);
        numbers1.add(8);
        numbers1.add(1);
        numbers1.add(2);

        List<Integer> numbers2 = new ArrayList<>();

        numbers2.add(3);
        numbers2.add(1);
        numbers2.add(8);
        numbers2.add(2);
        numbers2.add(5);

        System.out.println("numbers1 = " + numbers1);
        System.out.println("numbers2 = " + numbers2);

        System.out.println(numbers1.equals(numbers2));  // false

        numbers2.remove(4);

        System.out.println("numbers1 = " + numbers1);
        System.out.println("numbers2 = " + numbers2);

        System.out.println(numbers1.equals(numbers2));  // false
    }
}

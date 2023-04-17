package Day40_GarbageCollector_FinalFinallyFinalize;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_ListIterators {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(56);
        numbers.add(3);
        numbers.add(4);


        // add 3 to each element

        ListIterator lit = numbers.listIterator();

        while (lit.hasNext()){

            Integer number = (Integer) lit.next();

            lit.set(number+3);
        }

        System.out.println(numbers);        // [9, 59, 6, 7]


        System.out.println("===========");


        // print all elements starting from the end of the list

        while (lit.hasPrevious()){
            System.out.print(lit.previous() + " ");     // 7 6 59 9 
        }





    }
}

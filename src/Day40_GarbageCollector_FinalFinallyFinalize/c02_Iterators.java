package Day40_GarbageCollector_FinalFinallyFinalize;

import java.util.Arrays;

public class c02_Iterators {
    public static void main(String[] args) {

        int [] arr = {3,4,8,6,4,8,2,12};
        // print all elements of the arr

        for (int each: arr
             ) {

            System.out.print(each + " ");       // 3 4 8 6 4 8 2 12
        }

        System.out.println();
        System.out.println("============");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");     // 3 4 8 6 4 8 2 12
        }

        // without using index structure
        // please add 3 to all elements
        /*
        we can not use fori loop because we can not use index structure
         */
        System.out.println();
        System.out.println("============");

        for (int each: arr
            ) {

            each +=3;
            System.out.print(each + " ");   // 6 7 11 9 7 11 5 15
        }

        System.out.println();
        System.out.println("============");

        System.out.println(Arrays.toString(arr));   // [3, 4, 8, 6, 4, 8, 2, 12]  gave the aa without adding 3

         /*
        by using for each loop, even we do not use index, we can print all elements, but we can not change them
         */


    }
}

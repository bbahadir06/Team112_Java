package Day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C05_noRepeatedNumber {
    public static void main(String[] args) {

        // get rid of repeated numbers from an array
        int [] arr = {3,4,5,6,3,4,5,6,5,4,3,4,5,6,5,6,5,4,3,4,5,6,5,4,5,6,3,4,5,6,5};
        List<Integer> uniqueList = new ArrayList<>(); // created an empty list to store unique elements of the array
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (!uniqueList.contains(arr[i])){  // does not contain means that there is no another number than the one in the list
                uniqueList.add(arr[i]);
            }
        }
        System.out.println(uniqueList);



    }
}

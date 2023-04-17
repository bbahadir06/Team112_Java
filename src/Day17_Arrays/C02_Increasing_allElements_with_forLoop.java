package Day17_Arrays;

import java.util.Arrays;

public class C02_Increasing_allElements_with_forLoop {
    public static void main(String[] args) {

        // increase all elements of an array by 2

        int [] intArr =  {3,6,3,9};

        for (int i = 0; i <intArr.length ; i++) {
            intArr[i]=intArr[i]+2;
        }
        System.out.println(Arrays.toString(intArr));    // [5, 8, 5, 11]



    }
}

package Day17_Arrays;

import java.util.Arrays;

public class C03_CreatingMethods_to_Increase_Values_by_Return {
    public static void main(String[] args) {

        // create a method to increase values of an array by 2  // took place in main method

        int[] intArr = {3,6,4,9};
        intArr =changeValuesOfArray(intArr,2);  // this is our created method
        System.out.println(Arrays.toString(intArr));

    }

    public static int[] changeValuesOfArray(int[] intArr, int increment){
        for (int i = 0; i <intArr.length ; i++) {
            intArr[i] = intArr[i]+increment;
        }
        return intArr;      // return is outside the loop but inside the method and is required for creating the method


    }





}

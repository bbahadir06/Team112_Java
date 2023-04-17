package Day17_Arrays;

import java.util.Arrays;

public class C04_Increasing_of_Values {

    // increase values of an array by 5


    public static void main(String[] args) {

        int [] intArr = {2,5,8,4};
        int increment = 5;

        intArr=C03_CreatingMethods_to_Increase_Values_by_Return.changeValuesOfArray(intArr,increment); // method from C03
        System.out.println(Arrays.toString(intArr));








    }
}

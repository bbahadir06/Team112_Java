package Day18_Multi_Dimensional_Arrays_MDA;

import java.util.Arrays;

public class C07_MDA {
    public static void main(String[] args) {

        int [][] arr ={{3,4,5},{2,3},{1}};

        System.out.println(arr[0][0]); // 3
        System.out.println(arr[1].length); // 2
        System.out.println(arr[1]);  // [I@19dfb72a
        System.out.println(Arrays.toString(arr[2])); // [1]
        System.out.println(Arrays.toString(arr)); // [[I@17c68925, [I@19dfb72a, [I@7e0ea639]
        System.out.println(Arrays.deepToString(arr));  // [[3, 4, 5], [2, 3], [1]]
        System.out.println(arr.length); // 3



    }
}

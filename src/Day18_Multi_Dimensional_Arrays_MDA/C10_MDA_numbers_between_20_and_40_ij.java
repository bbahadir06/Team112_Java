package Day18_Multi_Dimensional_Arrays_MDA;

public class C10_MDA_numbers_between_20_and_40_ij {
    public static void main(String[] args) {

        int[][] arr = {{13, 25, 37}, {41, 12, 23, 34}, {11, 25}, {17}};

        // find numbers these are between 20 and 40 (include borders)

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] <= 40 && arr[i][j] >= 20) {
                    System.out.println(arr[i][j]);
                }
            }
        }




    }
}

package Day18_Multi_Dimensional_Arrays_MDA;

import java.util.Arrays;

public class C08_MDA_number_of_elements {
    public static void main(String[] args) {


        String[][] classes = {{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};

        // print "G"
        System.out.println(classes[0][2]);

        // change "Q" with "Y"
        classes [2][2] = "Y";


        // for printing MDA  // [[A, B, G, M], [F, P, A, V], [K, D, Y]]

        System.out.println(Arrays.deepToString(classes)); // we are adding deep



        // calculate total number of students   //  11

        int sum =0;

        for (int i = 0; i <classes.length ; i++) {
            sum = sum + classes[i].length;
        }
        System.out.println(sum);


    }
}

package Day13_nestedLoops_methodCreation;

public class C03_NestedLoops_i_and_j {

    public static void main(String[] args) {

    /*
        1
        1 2
        1 2 3
        1 2 3 4
         */
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }





    }
}

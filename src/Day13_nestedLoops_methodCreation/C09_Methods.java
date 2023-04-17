package Day13_nestedLoops_methodCreation;

public class C09_Methods {

    public static void main(String[] args) {

        System.out.println(factorial(8));
    }

    public static int factorial ( int number) {
        int factorial = 1;

        for (int i = number; i > 0; i--) {
            factorial = factorial * i; // factorial*=i more professional
        }

        return factorial;

    }


}

package Day39_exceptions;

public class C03_ThrowException {
    public static void main(String[] args) {

        System.out.println("hello");
//
        try {
            System.out.println("test1");
            throw new IllegalArgumentException();
//
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException is thrown manually");
       }
            int number = -10;
            try {
                if (number < 0) {
                    throw new IllegalArgumentException();
                }
                System.out.println("Test11");   // does not write Test1 and Test2 as it directly goes to line 23
                System.out.println("test12");
            } catch (IllegalArgumentException e) {
                System.out.println("Number can not be -");
            }


    }
}


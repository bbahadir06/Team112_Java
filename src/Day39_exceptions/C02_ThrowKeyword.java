package Day39_exceptions;

public class C02_ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Hello");
        /*
        By using throw keyword we can manually trigger any exception we want
         */
        throw new RuntimeException();
        //System.out.println("Hello2");

    }
}

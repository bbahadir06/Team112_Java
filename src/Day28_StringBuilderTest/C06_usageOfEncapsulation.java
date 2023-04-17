package Day28_StringBuilderTest;

public class C06_usageOfEncapsulation {
    public static void main(String[] args) {



        /*
        By using the method we have created in C05_Encapsulation method named getter, we can reach the data but we
        can not change it
         */
        System.out.println(C05_Encapsulation.getCompanyName());                      // Star Sale
        System.out.println(C05_Encapsulation.getCompanyName().toUpperCase());        // STAR SALE
        System.out.println(C05_Encapsulation.getCompanyName());                      // Star Sale

        C05_Encapsulation toReachSetter = new C05_Encapsulation();
        toReachSetter.setSaleAmount(100);


    }
}

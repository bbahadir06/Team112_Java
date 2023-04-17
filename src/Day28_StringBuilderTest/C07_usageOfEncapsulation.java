package Day28_StringBuilderTest;

public class C07_usageOfEncapsulation {
    public static void main(String[] args) {

    C05_Encapsulation sellerObject = new C05_Encapsulation();

    sellerObject.setSaleAmount(100);
    sellerObject.setSaleAmount(150);
    sellerObject.setSaleAmount(20);
    sellerObject.setSaleAmount(25);

        System.out.println("total amount : " + sellerObject.getTotalSaleAmount());      // 295

    }
}

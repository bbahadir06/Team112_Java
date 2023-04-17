package Day28_StringBuilderTest;

public class C05_Encapsulation {

    static private String companyName = "Star Sale";
    private int saleAmount; // we will enter the amount, but we won't be able to see the amount
    private int totalSaleAmount; // we should be able to see it but should not be able to change it


    public static String getCompanyName() {     // created a getter method by using code menu
        return companyName;
    }

    public void setSaleAmount(int saleAmount) {     // // created a setter method by using code menu
        this.saleAmount = saleAmount;
        totalSaleAmount+= saleAmount;
    }

    public int getTotalSaleAmount() {       // created a getter method by using code menu
        return totalSaleAmount;
    }
}

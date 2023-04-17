package Day29_encapsulation_Inheritance;

public class C01_EncapsulationPersonal {

    private int  personalSumIncome =0;  // personal will be able to read this amount
    private int sellerSoldProductIncome =0; // seller will be able to enter this amount
    private  boolean holiday = true;
    // By using this getter method we can see the total amount, but we can not change it no matter what. Because it
    // does not have any setter method


    public int getPersonalSumIncome() {
        return personalSumIncome;
    }

    // By using this setter method we can enter an amount, but we can not see it. Because it does not have any getter method
    public void setSellerSoldProductIncome(int sellerSoldProductIncome) {
        sellerSoldProductIncome = sellerSoldProductIncome;
        personalSumIncome = personalSumIncome + sellerSoldProductIncome;
    }

    public boolean isHoliday() {

       return holiday;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }

}

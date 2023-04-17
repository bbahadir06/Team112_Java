package Day29_encapsulation_Inheritance;

public class C02_Seller {

    public static void main(String[] args) {

        // to reach non-static variable and method we created an object from the class

        C01_EncapsulationPersonal pers01 = new C01_EncapsulationPersonal();

        pers01.setSellerSoldProductIncome(100);
        pers01.setSellerSoldProductIncome(150);
        pers01.setSellerSoldProductIncome(300);

        System.out.println(pers01.getPersonalSumIncome());      // 550



    }
}

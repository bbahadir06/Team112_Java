package Day30_inheritance;

public class C03_Corolla extends C02_Toyota {

    String tire = "Lassa 205-55-15";
    String model = "Corolla";
    String fuel = "Corolla can use gasoline, diesel";
    public void motor () {
        System.out.println(" corolla motors are produced in England");
    }
    public void madeIn(){
        System.out.println("Corolla can be produced in Türkiye");
    }


    public static void main(String[] args) {    // Toyota

        C03_Corolla car1 = new C03_Corolla();

        System.out.println(car1.tire);  // Lassa 205-55-15
        System.out.println(car1.model); // Corolla
        System.out.println(car1.fuel);  // Corolla can use gasoline, diesel

        car1.motor();   // corolla motors are produced in England
        car1.madeIn();  //Corolla can be produced in Türkiye

        System.out.println(car1.brand); // C02
        System.out.println(car1.gear);  //Every car has a gear system // C01

        car1.security();        // Toyota security supports 2020 standards  // C02




    }
}

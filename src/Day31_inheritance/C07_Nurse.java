package Day31_inheritance;

public class C07_Nurse extends C06_Accounting {

    String title = "Nurse";
    public void standardSalary (){
        System.out.println("Nurse will take  10 000");
    }
    public void insurance(){
        System.out.println("Nurse will have an insurance");
    }

    public static void main(String[] args) {

        C07_Nurse nurse1 = new C07_Nurse();
        nurse1.method();

    }

    public void method(){

        System.out.println(title);          // Nurse
        System.out.println(this.title);     // Nurse
        System.out.println(super.title);    // not entered

        this.standardSalary();  // Nurse will take  10 000
        super.standardSalary(); // Personal standard salary : 8500

        this.insurance();       // Nurse will have an insurance
        super.insurance();      // Insurance


        /*

        1- Super() Calls a constructor from parent class

        2- This() calls a constructor from same class

        3- super. Calls a variable or method from the parent class

        4- this. Calls a variable or method from the class itself

         */


    }
}

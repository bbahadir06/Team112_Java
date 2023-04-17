package Day16_Scope_Arrays;

public class C02_Static_nonStatic {

    static String str1 = "staticVariable";
    String str2 = "NonStaticVariable";
    String str3 = "nonStatic var 2";

    public static void main(String[] args) {

     //   System.out.println(str2);    we cannot use a non-static variable inside a static method

        C02_Static_nonStatic variable = new C02_Static_nonStatic();  // we can give a name or something as variable here

     // for reaching str2 via the object

        System.out.println(variable.str2);

        // by creating an object you can use non-static variables in static methods

        ADoctor doctor4 = new ADoctor();
        doctor4.name = "Adnan";
        System.out.println(doctor4.name);

        System.out.println(str1);

        // when we want to reach a non-static variable, first we need to check where it is.
        // we should take the name of the class of that variable and by using that class, we should create an object from the class
        // then we can reach the non-static variable by using created object

        C02_Static_nonStatic testObject1 = new C02_Static_nonStatic();

        System.out.println(testObject1.str2); // NonStaticVariable

        // System.out.println(str2);

        System.out.println(testObject1.str3); // nonStatic var 2


        ADoctor abcd = new ADoctor();
        System.out.println(abcd.phoneNumber);


    }
}

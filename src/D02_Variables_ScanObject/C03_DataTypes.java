package D02_Variables_ScanObject;

public class C03_DataTypes {

    public static void main(String[] args) {

        double number1=3.1234567890123456789; // 3.1234567890123457 // last decimal maybe different from the original

        System.out.println(number1);

        float number2=2.1234567890123456789f; // 2.1234567  // when we are creating a float we need to write f or F
        // at the end of the number

        System.out.println(number2);


        boolean isStudent = true ;  // boolean can store two different values, true and false
                                    // when you use doubles, you may have interesting results because of the last decimal

        byte byteNumber =12; // -128 =< 127  byte can take any number between these values
        short shortNumber = 13;
        int intNumber = 14;
        long longNumber = 15;

        // we will use int and double in the lessons


    }




}

package Day28_StringBuilderTest;

import Day28_stringBuilders_AccessModifiers_Encapsulation.C01_AccessModifiers;

public class C04_AccessModifiersProtectedTest_extends_C01_AccessModifiers {
    public static void main(String[] args) {

        //C01_AccessModifiers.protectedStr just like C03, we couldn't be able to reach it before creating parent-child relation
        // "extends C01_AccessModifiers" by adding this part after class name, I have created a parent-Child relation
        // between these classes. So if the datatype is protected, from this point on, I can reach all protected variables

       // System.out.println(C01_AccessModifiers.protectedStr);
     //   C01_AccessModifiers.protectedStr ="I changed protectedStr because I am child of that class";
        // As you can see, still we can not reach a default access typed variable





    }
}

package Day28_StringBuilderTest;

import Day28_stringBuilders_AccessModifiers_Encapsulation.C01_AccessModifiers;

public class C03_AccessModifiersTestFromDifPackage {
    public static void main(String[] args) {

        // Public
        System.out.println(C01_AccessModifiers.publicStr); // I could be able to reach public variable from different package
       C01_AccessModifiers.publicStr="I can change public variable from different package"; // because it is public

        //Default
        //C01_AccessModifiers.defaultStr // because defaultStr is default we can not reach it from different package
        // it can be only used in same package

        //protected
        //C01_AccessModifiers.protectedStr // just like the default access modifier, I can not reach it from another package




    }
}

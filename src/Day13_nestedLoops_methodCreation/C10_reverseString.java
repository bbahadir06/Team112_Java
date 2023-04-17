package Day13_nestedLoops_methodCreation;

public class C10_reverseString {
    public static void main(String[] args) {

        // reverse a string

            System.out.println(reverseString("asdf"));
            System.out.println(reverseString("qwer"));
            System.out.println(reverseString("Java is funny"));

    }

    public static String reverseString(String str) {

        String outPut = "";                         // the logic?
        int a = str.length() - 1;
        for (int i = a; i >= 0; i--) {               // why not i>0
            outPut = outPut + str.charAt(i);
        }
        return outPut;
    }








}

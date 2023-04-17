package Day27_stringBuilder;

public class C04_stringBuilder_stringMethods {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Life");
        StringBuilder sb2 = new StringBuilder("Java life");
        System.out.println(sb1.substring(5)); // Life

        // sb1 = sb1.substring(5);  right side is String, and the left side is StringBuilder so java can not
        // execute this code

        System.out.println(sb1);  //  Java Life
        System.out.println(sb1.compareTo(sb2));  // -32
        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.subSequence(3,6);
        System.out.println(sb1); //Java Life


    }
}

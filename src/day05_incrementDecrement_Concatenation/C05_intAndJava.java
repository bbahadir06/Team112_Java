package day05_incrementDecrement_Concatenation;

public class C05_intAndJava {

    public static void main(String[] args) {

       String s1= "Java";

       String s2= " ";

       String s3= "easy";

       String s4= "";

       int a= 3;
       int b= 4;

        System.out.println(a*b+s2+s1+s2+s3);    // 12 Java easy    correct

        System.out.println((a+b)+s2+s1+s2+s3);  // 7 Java easy     correct

        System.out.println("34"+s1+s2+s3);      // 34Java easy     correct after third try

        System.out.println(s1+s2+a*b+s3);       // Java 12easy     correct

        System.out.println(s1+"34"+s3);         // Java34easy      correct

        System.out.println(s1+(a+b)+s3);        // Java7easy     correct after second try















    }






}

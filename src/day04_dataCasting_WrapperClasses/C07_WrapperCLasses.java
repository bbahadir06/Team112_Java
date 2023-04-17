package day04_dataCasting_WrapperClasses;

public class C07_WrapperCLasses {


    public static void main(String[] args) {

    String str = "Ali Can";

    int number = 12;   // these function in same way
    Integer numberW = 12;

    /*
    We used primitive data types and stored a lot of data inside
    But these primitive data types do not have any premade methods

    So java created wrapper classes of these primitive data types

    int  >>>  Integer
    char >>>  Character
    byte >>>  Byte
    boolean >>>  Boolean

    These wrapper classes have premade methods for us in coding
    They store same kind of data.

     */

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String strNumber = "345";
        System.out.println(strNumber+10); // we get 34510 as it sees 345 as a text

        // but if we make the following coding

        int intNumber = Integer.parseInt(strNumber);
        System.out.println(intNumber+1);  // we get 346 as it sees 345 as an int not a text. Or

        System.out.println(Integer.parseInt(strNumber)+1); // we get the same result: 346

        // therefore the last two coding in 38. and 40. lines are same. In the second one, we don't need (int intNumber =)part
        // in 37. line in 40. one.


        char chr = 'k';

        System.out.println(Character.isDigit(chr)); // false. it checks whether it is a digit or not. it is not a digit then false.
        System.out.println(Character.isLetter(chr)); // true as it is a letter.
        System.out.println(Character.isAlphabetic(chr)); // true as it is alphabetic.


















    }
}

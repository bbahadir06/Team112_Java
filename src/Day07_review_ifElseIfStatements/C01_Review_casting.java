package Day07_review_ifElseIfStatements;

public class C01_Review_casting {
    public static void main(String[] args) {

        // Java can not convert all data types

        /*
        String str1 = false;
        String str2 = 12;
        boolean bl1 = 23;
        int number1 = "Hello";

        */
        // when we try to assign a datatype with smaller capacity to a larger capacity, java will hande the casting.
        // without doing anything java will change the data type to bigger one ( auto widening )
        double db1 = 23;
        short sh1 = 45;
        int number2 = sh1;
        // when wt try to assign a datatype with lager capacity to smaller capacity, Java will underline it. To hande
        // the problem, If we want to force java to convert the datatype we need to write the data type. It is called
        // explicit narrowing
        sh1 = (short) number2;
        char chr1 = 'K';  // to assign we need to use  single quotes
        int number3 = 'K';
        if (number3 > 'B') {
            System.out.println("K has higher value than B");
        }
        System.out.println('k'+1);  // 108  java likes the math, // java likes the math. so it used the ascii value of 'k'
        System.out.println((char)('k'+1)); //l if we want to have l we need to add (char)
        String strNumber ="123";
        System.out.println(Integer.parseInt(strNumber)+1); //124  wee need to add Integer.parseInt for casting string into an int
        System.out.println(strNumber+1); //1231  strNumber behaves as String since String is strong


























    }
}

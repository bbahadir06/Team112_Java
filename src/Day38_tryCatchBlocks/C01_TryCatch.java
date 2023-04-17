package Day38_tryCatchBlocks;

public class C01_TryCatch {
    public static void main(String[] args) {

      int num1 = 20;
      int num2 = 0;


        try {
            System.out.println("test0");
            System.out.println(num1 / num2);    // exception
            System.out.println("test1");
            System.out.println("test2");
            System.out.println("test3");

        } catch (Exception e) {
            System.out.println("you cannot use zero for the second number");
        }

        /*
        When an exception occurs in try catch blocks, the rest of the code will be ignored
        Java will directly jump to the catch block

        If no exceptions occur, codes will be executed without any problem and we won't be able to see
        " you can not use zero for the second number" message

         */



    }
}

package Day15_While_doWhileLoop_Scope;

public class C06_doWhileLoops {
    public static void main(String[] args) {

        int startingNumber = 10;
        int sum = 0;
        while (startingNumber<20){
            sum+=startingNumber;
            startingNumber++;
        }
        System.out.println("sum of numbers from while loop "+sum);



        startingNumber = 10;
        sum =0;
        do {
            sum+=startingNumber;
            startingNumber++;
        }while (startingNumber<20);
        System.out.println("sum of numbers from do while loop "+sum);




    }
}

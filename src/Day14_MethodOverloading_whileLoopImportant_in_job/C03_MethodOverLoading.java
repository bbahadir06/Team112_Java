package Day14_MethodOverloading_whileLoopImportant_in_job;

public class C03_MethodOverLoading {
    public static void main(String[] args) {

        String str ="Java is useful";

        System.out.println(str.substring(5)); // for same method name we can create different functions by increasing
        System.out.println(str.substring(5, 8)); // number of arguments

        System.out.println(str.replace('a', 'o'));  // for same method name we can create different functions by
        System.out.println(str.replace("is", "are")); // changing the data type


    }
}

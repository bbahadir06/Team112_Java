package Day23_Constructors;

public class C05_StaticKeyword {

    /*
    1) Static variables are stored in the class. And there will be only one value

    2) Static variables can not be stored in objects

    3) Normally we do not need to reach a static variable by using the object name
    but we can reach it by using the object name
     */
    static String hospitalName = "Star Hospital";
    static String hospitalPhone = "23542345";
    static String hospitalAddress= "England";
    String perName;
    String perAddress;
    String perPhone;

    public static void main(String[] args) {

      C05_StaticKeyword pers1 = new C05_StaticKeyword();
        System.out.println(pers1.perName);          // null
        System.out.println(hospitalName);           // Star Hospital
        System.out.println(pers1.hospitalPhone);    // 23542345

        C05_StaticKeyword pers2 = new C05_StaticKeyword();

        pers2.perName = "Dogan";

        System.out.println(pers2.perName);      // Dogan
        System.out.println(pers1.perName);      // null

        pers1.hospitalPhone ="96658974";
        System.out.println(pers2.hospitalPhone);    //  96658974   This is important as we can change a static variable
                                                    //  in class through an object


    }

}


    /*
    1- Constructor : When we want to create an object from a class, we use constructors

    2- When we create an object from a class, Constructor creates the object and copies the instance variables     to the object from the class

    3- When we use a constructor without any parameters, the constructor creates the object and copies the variables and if we do not assign any values to these variables, java will assign default values

    4- When we create a class, Java creates a default constructor which is invisible. So we can create objects from this class

    5- Default constructor is invisible and it has no parameters and it has nothing inside of its body

    6*- When we create a constructor inside of a class, java deletes the default constructor

    7- Let’s say we created a constructor with some parameters, when we create it java will delete the default constructor. So ,before us, if somebody else had used that constructor; to prevent unwanted problems we should create a copy of default constructor

    8- If we want to change default values of variables when we create the object, we can create a constructor with parameters






     */
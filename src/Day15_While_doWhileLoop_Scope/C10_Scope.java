package Day15_While_doWhileLoop_Scope;

public class C10_Scope {


    // class level variables
    static int number = 10;
    static String name;  // if you do not assign any value to a class level variable, default value will be assigned
    static boolean bl;
    static char chr;
    static int num1;
    int num2;
    boolean bl2;


    public static void main(String[] args) {    // for now, in a static method, everything should be static

        String str2 = "Ali Can";

        System.out.println("class level number : " + number);
        System.out.println("class level String : " + name);
        System.out.println("class level boolean : " + bl);
        System.out.println("class level char : " + chr);
        System.out.println("class level num1 : " + num1);

        //  System.out.println(num2);     // num2 and bl2 are not static variables so we can not use then in a static method
        //  System.out.println(bl2);

        String testSTR;

        //  System.out.println(testSTR);  // if we create a variable in a method and if we don't assign any value to it
        // without assignment, we cannot use it in code


    }
        public static void secondMethod() {

            System.out.println("class level number : "+number);
            System.out.println("class level String : "+name);
            System.out.println("class level boolean : "+bl);
            System.out.println("class level char : "+ chr);
            System.out.println("class level num1 : "+num1);

        //     System.out.println(num2);     //  num2 and bl2 are not static variables so we can not use then in a static method
        //     System.out.println(bl2);

            }

        static String testVariable = "Ali";    //  to create a class level variable it should be outside  all methods
                                               //  but inside  the class

        public void thirdMethod(){

            System.out.println("class level number : "+number);
            System.out.println("class level String : "+name);
            System.out.println("class level boolean : "+bl);
            System.out.println("class level char : "+chr);
            System.out.println("class level num1 : "+num1);

            System.out.println(num2);       // if the method is not static, we can print all static and non-static  variables
            System.out.println(bl2);





        }





    }


package Day24_staticKeyWord_staticBlocs;

public class C01_StaticBlocs {

    C01_StaticBlocs (){
        System.out.println("Constructor is executed");
    }




    public static void main(String[] args) {

        System.out.println("main method is executed");

        System.out.println("============");
        C01_StaticBlocs obj1 = new C01_StaticBlocs();
    }


        static {

        /*
        Static Block
        When class starts running before main method static block is executed. If we want to arrange something before
        main method we should use static blocs
        if there are more than one static block in the class they will be executed according to the order
         */


            System.out.println("Static block is executed");
        }

    {
    /*
        Non-Static Block
        Non-static blocks are executed before object creation when we try to create an object
        We use it to arrange a few things before creating an object
         */

        System.out.println("Non static method is executed");  // it was not seen in the console, but whenever we added
                                                              // C01_StaticBlocs constructor in line 5 and 17, it was also
    }                                                         // seen in console


}


    /*

    Static block is executed
    main method is executed
    ============
    Non static method is executed
    Constructor is executed




     */
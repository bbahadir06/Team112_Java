package Day15_While_doWhileLoop_Scope;

public class C09_Scope {

    // Class level variables can be reached from everywhere in the class

    static int classLevelInt = 100;

    public static void main(String[] args) {

        // if you create a variable in a method you can not reach it from outside  the method
        // scope of this name variable is the main method

        String name = "Ali Can";

        //  System.out.println(numbers);

        System.out.println(classLevelInt);

        for (int i = 0; i < 10; i++) {   // if we create a variable in a loop, we cannot use it outside  that loop
            // the scope of this text variable is the loop


            String text = "Veli";
            System.out.println(text);
            System.out.println(classLevelInt + 1);
        }
        // System.out.println(text);  / we cannot run text as  it is out of its loop now

    } public static void newMethod () {

       //  System.out.println(name);  // as name belongs to main method, we cannot run it in this method

        int number = 1999;

        System.out.println(classLevelInt);




    }
}

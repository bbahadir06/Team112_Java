package Day15_While_doWhileLoop_Scope;

public class C01_Q2_Slide_144 {
    public static void main(String[] args) {

       //   Question 2- Get the user's name and surname separately in the main method
       //   Create a method that returns: first letters of first and last name as capitals and rest should be in
       //   lower case
       //   input : name : Ali surname :YILMAZ
       //   output : Ali Yilmaz

        //        Scanner scan = new Scanner(System.in);
        //        System.out.println("please enter your name");
        //        String name = scan.next();
        //
        //        System.out.println("please enter your surname");
        //        String surname = scan.next();

        String name ="muHammEd";
        String surname ="lAsTMaN";
        System.out.println(nameConverter(name, surname));
    }

        public static String nameConverter(String name, String surmane){

        //we took first letter of the name and made it a capital
        String output=   name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + " "+
                surmane.substring(0,1).toUpperCase()+surmane.substring(1).toLowerCase();
        return output;









    }
}

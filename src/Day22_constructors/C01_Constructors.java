package Day22_constructors;





import Day16_Scope_Arrays.ADoctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class C01_Constructors {


     public static void main(String[] args) {

         /*
        An object can be created from a class.
        When we create an object from a class, the object's data type will be the class we created it from
        The object will carry  features of the class
         */

         Scanner scan= new Scanner(System.in);   // we created an object (named scan) from Scanner class

         List<String> names = new ArrayList<>();

         Integer number= 12;

         ADoctor doctor1 = new ADoctor();  // by using same class, we can create lots of different objects
                                           // by the way, wen i wrote ADoctor class in line 31, line 7 was written automatically

         ADoctor doctor2 = new ADoctor();

         ADoctor doctor3 = new ADoctor();

         Random rnd = new Random();

         String srt1;
         ADoctor doctor5;

    }
}

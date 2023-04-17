package Day38_tryCatchBlocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_ParentChildException {
    public static void main(String[] args) {

        String filePath = "src/day38_tryCatchBlocks/text.txt";  // address of my file

        /*
        first we should try to catch the exception by using specific catchers, still if we can not,
        we should use a general exception catcher
        */


        try {

            FileInputStream fls = new FileInputStream(filePath);    // // we are trying to do something with the file


        } catch (FileNotFoundException e) {

            System.out.println("Java could not be able to find the file");

        } catch (Exception e){

            System.out.println("there is a problem");
        }


    }
}

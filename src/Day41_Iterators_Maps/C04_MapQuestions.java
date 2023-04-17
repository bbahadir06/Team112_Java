package Day41_Iterators_Maps;

import java.util.HashMap;
import java.util.Map;

public class C04_MapQuestions {
    public static void main(String[] args) {

     /*
        Question: Print the names and surnames of the students in the H branch as a list.
         */
        Map<Integer,String> schoolMap = new HashMap<>();

        schoolMap.put(101,"Elçin-Cem-10-H");//  [Ali, Cem, 10, H]
        schoolMap.put(102,"Veli-Can-10-M");
        schoolMap.put(103,"Ali-Can-11-M");
        schoolMap.put(104,"Ayse-Cem-11-H");
        schoolMap.put(105,"Ayse-Han-10-H");
        schoolMap.put(106,"Veli-Han-10-H");



        MapMethods.namesOfStudentsFromBranch(schoolMap,"h");    // 1. methodun çağrılması from MapMethods class

        System.out.println(MapMethods.createExampleMap());  // 2.metodun çağrılması from MapMethods class
        // {101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}
    }
}

package Day41_Iterators_Maps;

import java.util.HashMap;
import java.util.Map;
/*
public class methodsWeCreated {

    public static void main(String[] args) {  // normally we don't use main method within Method class.
        // we used as it is just to see it
        // do not try at home  😂🤣



       Map<Integer,String> student = createExampleMap();  // method without void.
        // soldaki atamayı yaptık yoksa return yapılan bilgiler havada kalır


        System.out.println(student);
        // {101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        namesOfStudentsFromBranch(student,"m");   //  name : Veli, surname : Can
        // method with void                                          // name : Ali, surname : Can


    }
    public static void namesOfStudentsFromBranch(Map<Integer, String> schoolMap, String h) {    // 1. method
        for (String each: schoolMap.values()
        ) {
            String [] arr =each.split("-");  // [Ali, Cem, 10, H]
            if (arr[3].equalsIgnoreCase(h)){
                System.out.println("name : "+arr[0]+", surname : " + arr[1]);
            }
        }
    }

    public static Map<Integer,String> createExampleMap() {      //  2. method

        Map<Integer, String> schoolMap = new HashMap<>();

        schoolMap.put(101, "Ali-Cem-10-H");//  [Ali, Cem, 10, H]
        schoolMap.put(102, "Veli-Can-10-M");
        schoolMap.put(103, "Ali-Can-11-M");
        schoolMap.put(104, "Ayse-Cem-11-H");
        schoolMap.put(105, "Ayse-Han-10-H");
        schoolMap.put(106, "Veli-Han-10-H");

        return schoolMap;


    }



}
*/
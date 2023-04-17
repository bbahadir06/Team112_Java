package Day42_Maps;

import Day41_Iterators_Maps.MapMethods;

import java.util.Map;

public class C05_MapUpdate {
    public static void main(String[] args) {

    Map <Integer,String> schoolMap = MapMethods.createExampleMap();
        System.out.println(schoolMap);
        // {101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        int studentNumber = 103;
        String newSurname = "Bal";

        schoolMap = MapMethods.updateSurname(schoolMap, studentNumber, newSurname);
        System.out.println(schoolMap);
        // {101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Bal-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        schoolMap = MapMethods.updateSurname(schoolMap,106,"Java");
        System.out.println(schoolMap);
        // {101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Bal-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Java-10-H}


    }
}

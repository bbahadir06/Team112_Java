package Day42_Maps;

import Day41_Iterators_Maps.MapMethods;

import java.util.Map;

public class C02_MapUpdateWithMethod {
    public static void main(String[] args) {

        Map<Integer,String> schoolMap = MapMethods.createExampleMap();
        System.out.println(schoolMap);
        // {101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        MapMethods.updateBranch(schoolMap, "H", "Y");
        System.out.println(schoolMap);
        // {101=Ali-Cem-10-Y, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-Y, 105=Ayse-Han-10-Y, 106=Veli-Han-10-Y}

        MapMethods.updateBranch(schoolMap, "K", "A");
        System.out.println(schoolMap);
       // {101=Ali-Cem-10-Y, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-Y, 105=Ayse-Han-10-Y, 106=Veli-Han-10-Y}
       // as there is no K that wanted to be replaced with A, it was written the last change made in line 14
    }
}

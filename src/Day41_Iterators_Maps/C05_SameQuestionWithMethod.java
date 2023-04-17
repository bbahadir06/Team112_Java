package Day41_Iterators_Maps;

import java.util.Map;

public class C05_SameQuestionWithMethod {

    public static void main(String[] args) {

        // by using the method in mapMethods class we created a map and saved it in schoolMap

        Map<Integer,String> schoolMap = MapMethods.createExampleMap();
        MapMethods.namesOfStudentsFromBranch(schoolMap,"h");






    }
}

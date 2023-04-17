package Day09_SwitchStatement_StringManipulations;

public class C08_Length {

    public static void main(String[] args) {

        String str = "Java";
        System.out.println(str.length()); //4  // length gives us the number of characters, not index

        String str2 = "şasldkfjşaslkfjaşlsdkfjşklsdjfpweruqpoırupqowerıE";
        System.out.println(str2.length());  // 49

        System.out.println(str2.charAt(48)); // E
        System.out.println(str2.charAt(str2.length()-1));  // E






    }

}

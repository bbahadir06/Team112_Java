package Day27_stringBuilder;

public class C02_Reversıng_the_text {
    public static void main(String[] args) {

        // please reverse the text
        String str = "Java is beautiful";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse()); // lufituaeb si avaJ
        sb.reverse();
        System.out.println(sb); //Java is beautiful


    }
}

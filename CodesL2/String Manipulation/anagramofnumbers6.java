
import java.util.Arrays;

public class anagramofnumbers6 {

    public static String anagramcall(String str1){
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        String s = new String(ch1);
        return s;
    }

    public static void main(String[] args) {
        String str1 = "sahil";
        String strR1 = anagramcall(str1);
        String str2 = "lihas";
        String strR2 = anagramcall(str2);

        if(strR1.equals(strR2)){
            System.out.println("are anagrams");
        }
        else 
            System.out.println(" are not anagrams");
    }
}
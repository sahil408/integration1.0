import java.util.Arrays;

// Efficient way of code is defined below, Where we dont have to use space in memory more and more eg declaring two char arrays, One char Array do the job for us
// Also it act as a helper class

public class anagramOfStrings {
    public static String checkanagramcode(String str1) {

        char[] ch = str1.toCharArray();
        Arrays.sort(ch);
        String s1 = new String(ch);
        return s1;

    }

    public static void main(String[] args) {

        String str1 = "sahil";
        String newStr1 = checkanagramcode(str1);
        String str2 = "sahli";
        String newStr2 = checkanagramcode(str2);

        if (newStr1.equals(newStr2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }
}

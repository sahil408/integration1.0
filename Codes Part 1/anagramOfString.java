import java.util.Arrays;

public class anagramOfString {
    public static void checkAnagram(String s1, String s2) {

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        // sort array by loops

        for (int i = 0; i < ch1.length; i++) {
            for (int j = i + 1; j < ch1.length; j++) {
                if (ch1[i] > ch1[j]) {
                    char temp = ch1[j];
                    ch1[j] = ch1[i];
                    ch1[i] = temp;
                }
            }
        }

        // Arrays.sort(ch1);
        Arrays.sort(ch2);

        String str1 = new String(ch1);
        String str2 = new String(ch2);

        if (str1.equals(str2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }

    }

    public static void main(String[] args) {
        String str1 = "sahil";
        String str2 = "lihas";
        checkAnagram(str1, str2);

    }
    }
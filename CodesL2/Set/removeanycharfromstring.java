package CodesL2.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeanycharfromstring {
    public static void callreplace(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                s = s.replaceAll(Character.toString(s.charAt(i)), "");
            }
        }
        System.out.println(s.trim());
    }

    public static void removeduplicates(String s) {
        char[] c = s.toCharArray();
        Set<Character> removes = new HashSet<>();
        for (char ch : c) {
            removes.add(ch);
        }
        System.out.println(removes);

    }

    public static void removespaces(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : c) {
            if (!Character.isWhitespace(ch)) {
                sb.append(ch);
            }

        }
        System.out.println(sb);
    }

    public static void reversevowels(String s) {
        // char[] ch = s.toCharArray();
        char[] vow = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vow.length; j++) {
                if (s.charAt(i) == vow[j]) {
                    // s = s.substring(0, i) + '_' + s.substring(i+1);
                    s = s.replace(s.charAt(i), '_');
                    newS = newS + Character.toString(vow[j]);
                }
            }
        }
        StringBuilder sb1 = new StringBuilder();
        sb1.append(newS);
        String new1 = sb1.reverse().toString();
        System.out.println(s);
        System.out.println(sb1);

        int i = 0, j = 0;
        while (i < s.length() && j < new1.length()) {
            if (s.charAt(i) == '_') {
                s = s.substring(0, i) + new1.charAt(j) + s.substring(i + 1);
                // s = s.replace(s.charAt(i), new1.charAt(j));
                j++; // You only want to move to the next vowel when you've actually used one to
                     // replace a _.
            }
            i++; // Regardless of whether the character is a _ or not, you always want to move to
                 // the next character in s.

        }
        System.out.println((s));
    }

    public static void reversevowelsoptimised(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        if (left < right && !isVowel(ch[left])) {
            left++;
        }
        if (left < right && !isVowel(ch[left])) {
            right++;
        } else {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
        }

        System.out.println(new String(ch)); // This code need Revision

    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void reverseVowelsUsingString(String s){
        char[] ch = s.toCharArray();

        List<Character> vowels = new ArrayList<>();
        for(char c : ch){
            if(isVowel(c)){
                vowels.add(c);
            }
        }
        System.out.println(vowels);
        int len = vowels.size()-1;

        for(int i=0; i <ch.length;i++){
            if(isVowel(ch[i])){
                ch[i] = vowels.get(len--); // Need to revisit
            }
        }
        System.out.println(new String(ch));
        
    }

    public static void main(String[] args) {
        String s = "agbcochg dud g gAdrI";
        System.out.println(s);
        char c = 'g';
        callreplace(s, c);
        removeduplicates(s);
        removespaces(s);
        reversevowels(s);
        reversevowelsoptimised(s);
        reverseVowelsUsingString(s);
    }
}

// Solve for vowels

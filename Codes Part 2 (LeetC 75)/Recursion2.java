import java.util.HashSet;

public class Recursion2 {
    public static void printSubseq(String str, int idx, String res, HashSet<String> hs) {

        if (idx == str.length()) {
            if (hs.contains(res)) {
                return;
            } else {
                System.out.println(res);
                hs.add(res);
                return;
            }
        }
        
        printSubseq(str, idx + 1, res + str.charAt(idx), hs);
        
        printSubseq(str, idx + 1, res, hs);
    }

    public static void main(String args[]) {
        String str1 = "abc";
        HashSet<String> hs = new HashSet<>();
        // String str2 = "aaa";
        printSubseq(str1, 0, "", hs);
    }
}
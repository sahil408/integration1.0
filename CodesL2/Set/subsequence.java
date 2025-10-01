package CodesL2.Set;

import java.util.HashSet;

public class subsequence {

    public static void callseq(String str, int idx, String res, HashSet<String> hs){

        if(idx==str.length()){
            if(hs.contains(res)){
                return;
            }else   
                System.out.println(res);
                hs.add(res);
                return;
        }

        callseq(str, idx+1, res + str.charAt(idx), hs);

        callseq(str, idx+1, res, hs);

    }
    public static void main(String[] args) {
        String str = "abcd";
        HashSet<String> hs = new HashSet<>();
        callseq(str, 0, "", hs);
    }
}

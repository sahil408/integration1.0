package CodesNew;

public class maxNoVowelsInSubstring {

    public static int callVowSub(String s, int k){
        String s1 = "";
        int c1 =0;
        int res =0;

        for(int i=0; i<k ;i++){
            s1 = s1 + s.charAt(i);
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1){
                c1++;
            }
        }
        res = c1;

        for(int i=k; i<s.length();i++){
                if("aeiouAEIOU".indexOf(s.charAt(i-k)) != -1){
                    c1--;
                }
                if("aeiouAEIOU".indexOf(s.charAt(i)) != -1){
                    c1++;
                }
            res = Math.max(res, c1);
        }
        return res;
    }
   

    public static void main(String[] args) {
        String s = "abeiiidef";
        int k =3;
        callVowSub(s,k);
    }
}

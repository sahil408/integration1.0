package CodesL2.SlidingWindow;

public class maxNoVowelsInSubstring {

    public static int callVowSub(String s, int k){
        int c1 =0;
        int res =0;

        for(int i=0; i<k ;i++){
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
        String s = "abeidef";
        int k =3;
        int n =callVowSub(s,k);
        System.out.println(n);
    }
}

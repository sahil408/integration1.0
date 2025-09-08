package CodesL2.Recurssion;

public class keypad {

    public static void callComb(String str, int idx, String comb){
        String[] keypad  = {".", "abc", "def", "ghi","jkl", "mno", "pqrs","tu","vwx","yz"};
        
        if(idx==str.length()){
            System.out.println(comb);
            return;
        }
        char ch = str.charAt(idx);
        String s = keypad[ch-'0'];

        for(int i=0;i<s.length();i++){
            callComb(str, idx+1, comb+s.charAt(i));
        }
           
    }
    public static void main(String[] args) {
        String s = "567";
        callComb(s, 0 , "");
    }
}

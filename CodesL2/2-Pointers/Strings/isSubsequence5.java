
public class isSubsequence5 {

    public static boolean callseqoptimised(String s, String t){
        int i=0, j=0;
        while(i<s.length() && j<t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    i++;
                    j++;
                }else{
                    j++;
                }  
            }
        if(i==s.length()){
            return true; 
        }else{
            return false;
        }  
    }


    public static void main(String[] args) {
        String s = "abz";
        String t = "agfbfdc";
        boolean b = callseqoptimised(s,t);
        System.out.println(b);
    }
}




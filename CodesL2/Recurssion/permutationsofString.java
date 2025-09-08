package CodesL2.Recurssion;

public class permutationsofString {
    public static void printcomb(String s, String comb){
        if(s.length()==0){
            System.out.println(comb);
        }

        for(int i=0; i<s.length();i++){
            String newstr  = s.substring(0, i) + s.substring(i+1, s.length());
            printcomb(newstr, comb+s.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "abcd";
        printcomb(str, "");
    }
}
